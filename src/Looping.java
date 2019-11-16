import java.security.SecureRandom;

public class Looping {
    public static void main(String[] args)
    {
        SecureRandom rng = new SecureRandom();
        int randomNum=rng.nextInt(10)+1;
        System.out.println("The random number is "+randomNum);
        for(int i=1; i<randomNum ; i++)
            System.out.println("My name is Jaret");
    }


    /**
     * This is an example of adding a method
     */
    public static void exampleMethod()
    {
        System.out.println("Hello World");
    }


}
