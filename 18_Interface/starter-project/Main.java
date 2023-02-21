import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import pojo.Account;
import pojo.Checking;
import pojo.Credit;
import repository.AccountRepository;
import service.CheckingService;
import service.CreditService;

public class Main {

    public static void main(String[] args) {

        /* Three Layer Design
         * 1. Presentation
         *    - responsible for presenting the information to the user
         * 2. Service
         *    - the middleman between the presentation layer and the repository
         *    - presentation layer goes through service layer and then to the repository
         *    - service layer contains the application's business logic
         * 3. Repository
         *    - only layer that can access the data store
         *    - respository invokes CRUD : Create, Read, Update, or Delete data
         * 
         * pojo : Plain Old Java Object
         * - represents data that will be saved to a database
         * 
         * Interface:
         *  - contract of behavior
         *  - classes with similar behavior should implement a common interface
         */

        AccountRepository repository = new AccountRepository();
        CheckingService checkingService = new CheckingService(repository);
        CreditService creditService = new CreditService(repository);
        
        // Assume these were obtained from user input.
        List<Account> accounts = Arrays.asList(
            new Checking("A1234B", new BigDecimal("500.00")),
            new Checking("E3456F", new BigDecimal("300.50")),
            new Checking("I5678J", new BigDecimal("100.25")),
            new Credit("A1534B", new BigDecimal("0.50")),
            new Credit("G4567H", new BigDecimal("200.00"))
        );

        accounts.forEach(account -> {
            if (account instanceof Checking) {
                checkingService.createAccount((Checking) account);
            } else {
                creditService.createAccount((Credit) account);
            }
        });

        Checking checking = (Checking) repository.retrieveAccount("A1234B");
        checking.setBalance(checking.getBalance().add(new BigDecimal("100")));
        repository.updateAccount(checking);
        repository.retrieveAccount("G4567H");

        System.out.println(checking.getBalance());

    }


}