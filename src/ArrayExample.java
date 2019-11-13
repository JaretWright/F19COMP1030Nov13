import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args)
    {
        //the way we did it for assignment 1
        int grade1 = 89;
        int grade2 = 78;
        int grade3 = 82;
        int grade4 = 94;

        String name = "Jaret";

        //the pattern for declaring variables is use the data type and then give the variable
        //a name
        Scanner keyboard = new Scanner(System.in);
        int[]   grades   = new int[4];
        int[]   grades2  = {89,78,82,94,100,54,34,55};

        grades[0]=89;
        grades[1]=78;
        grades[2]=82;
        grades[3]=94;

        //loop to show what is inside the array
        for (int i=0; i<grades.length;i++)
            System.out.printf("index %d has value: %d%n",i,grades[i]);

        //add 5 to each number in the array by using a loop
//        grades[0]+=5;
//        grades[1]+=5;
//        grades[2]+=5;
//        grades[3]+=5;
        for (int i=0; i<grades.length; i++)
            grades[i] = grades[i]+5;


        //write another loop to display the new values in the array

        System.out.println("\nAfter adding 5");
        for (int i=0; i<grades.length;i++)
            System.out.printf("index %d has value: %d%n",i,grades[i]);


        System.out.println("\nComparing the average of the 2 arrays:");
        System.out.printf("Grades array average = %.1f%% %n", getAvg(grades));
        System.out.printf("Grades2 array average = %.1f%% %n", getAvg(grades2));

        System.out.printf("The smallest number in grades array is %d%n",min(grades));

    }

    public static int min(int[] array)
    {
        int min=array[0];
        for (int i=1;i<array.length;i++)
        {
            if (array[i]<min)
                min=array[i];
        }
        return min;
    }

    /**
     * This method accepts an array of integers and returns the average
     * as a double
     */
    public static double getAvg(int[] numbers)
    {
        double sum=0;
        for (int i=0; i<numbers.length; i++)
            sum = sum+numbers[i];

        return sum/numbers.length;
    }

}
