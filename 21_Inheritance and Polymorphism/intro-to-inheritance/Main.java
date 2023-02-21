public class Main {
    public static void main(String[] args) {

        /* Override
         * - change the logic of an inherited method
         * - Person class with override the equals() method from the Object class
         */

        /* HashCode
         * - must override hashCode() when overriding equals() method
         * - objects that are equal must share the same hashCode
         */

        /* Equality Contract:
         * - objects that are equal must share the same hashCode
         */

        /* Polymorphism
         * - an object can take many forms
         * - inheritance allows an object to take many forms
         * - inheritance allows an object to be polymorphic
         * - an object can take its own form
         * - an object can take the form of the class it inherits from
         */

        Person person = new Person("Sidney", 19);

        //polymorphism example : a Person object can be of the Object class
        Object person2 = new Person(person);
        //Person person2 = person;

        //System.out.println(person2 == person); // never use '==' to compare objects
        //System.out.println(person2.equals(person)); // overriden equals() method sets this statement to true

        System.out.println("Equality: " + person2.equals(person));
        System.out.println(person.hashCode());
        System.out.println(person2.hashCode());

        System.out.println(person);
    } 
}
