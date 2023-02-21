public class ImmutableVsMutable {
    public static void main(String[] args) {
        /*
         * Immutable Object :
         * - The state of an immutable object cannot be changed
         * - References can be shared safely across you application
         * 
         * Mutable Object :
         * - less safe becuase it can be modified after creation
         * - avoid setting two variables equal to each other
         * - sharing references can lead to unintended side effects
         */

        // **************** Immutable Object ****************
        Integer applesWrapper = 5;

        Integer applesWrapper2 = applesWrapper;     // SAFE
        applesWrapper2 = 10;

        System.out.println(applesWrapper);
        System.out.println(applesWrapper2);

        // **************** Mutable Object ****************
        
        City city = new City("Paris", 2161000);
        City secondCity = new City(city); //call the copy constructor to make a copy of the object

        city.setPopulation(2261000);
        secondCity.setPopulation(2263400);
        city.setPopulation(2163400);
        secondCity.setPopulation(2443400);

        System.out.println(city.getPopulation());
        System.out.println(secondCity.getPopulation());
    }
}
