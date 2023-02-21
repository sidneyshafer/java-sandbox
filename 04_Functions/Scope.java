public class Scope {

    //variable can be accessed from any method/function
    static int dogs = 3;
    
    public static void main(String[] args) {
        int apples = 5;

        System.out.println(dogs);
        System.out.println(apples);

        someFunction();
    }

    public static void someFunction() {
        int apples = 10;
        
        System.out.println(dogs);
        System.out.println(apples);
    }
}
