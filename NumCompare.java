import java.util.*;

public class NumCompare 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double firstNumber = 0;
        double secondNumber = 0;
        String trash = "";
        System.out.println("Enter the first number: ");
        if (in.hasNextDouble())
        {
            firstNumber = in.nextDouble();
            in.nextLine();
            System.out.println("Enter the second number: ");
            if (in.hasNextDouble())
            {
                secondNumber = in.nextDouble();
                in.nextLine();
                if (firstNumber > secondNumber)
                {
                    System.out.println("The first number, " + firstNumber + ", is greater than the second number, " + secondNumber +".");
                } else {
                    if (firstNumber == secondNumber)
                    {
                        System.out.println("The two numbers are equal.");
                    } else {
                        System.out.println("The first number, " + firstNumber + ", is less than the second number, " + secondNumber +".");
                    }
                }
            } else {
                System.out.println("What you have entered is not a number. Please run the program again.");
            }
        } else {
            System.out.println("What you have entered is not a number. Please run the program again.");
        }


    }
    
}