public class Bus {
    
    public static void main(String[] args) {
        int passengersOnBus = 0;

        //add 9 passengers to bus
        passengersOnBus = passengersOnBus + 9;
        System.out.println(passengersOnBus); // 9

        //remove 5 passengers from bus
        passengersOnBus = passengersOnBus - 5;
        System.out.println(passengersOnBus); // 4

        //remove 4 passengers from bus
        passengersOnBus = passengersOnBus - 4;
        System.out.println(passengersOnBus); // 0

        // use the += or -= operator
        passengersOnBus += 5;
        System.out.println(passengersOnBus); // 5

        passengersOnBus -= 4;
        System.out.println(passengersOnBus); // 1
    }
}
