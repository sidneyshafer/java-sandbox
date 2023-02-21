public class Main {
    public static void main(String[] args) {

        /* static final CONSTANT
         * - a constant is static because it belongs to the class
         * - a constant is final becuase it cannot be assigned a new value
         * - a constant is declared with UPPERCASE_AND_UNDERSCORES
         * - General Rule: favor constants over loose values
         */
        
        Employee john = new Employee("John", 45);
        Employee lisa = new Employee("Lisa", 20);

        System.out.println("Retirement Age: " + Employee.MAX_AGE);
        System.out.println("Minimum Working Age: " + Employee.MIN_AGE);

        System.out.println(john.getName() + ", you can retire in " + (Employee.MAX_AGE - john.getAge()) + " years.");
        System.out.println(lisa.getName() + ", you have been eligible to work for " + (lisa.getAge() - Employee.MIN_AGE) + " years.");

    }
}
