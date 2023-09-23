import java.util.*;

public class BirthMonth
{
    public static void main(String[] args)
    {
        int month = 0;
        String trash = "";
        Scanner in = new Scanner(System.in);  
        System.out.println("Input your birth month [1-12]:");
        if(in.hasNextInt())
        {
            month = in.nextInt();
            in.nextLine(); //buffer clear
            if(month >= 1 && month <= 12)
            {
            System.out.println("Your birth month is: " + month);
            }
            else
            {
                System.out.println("You said your birth month was " + month + " but that is outside of the valid range [1-12].");
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered " + trash);
            System.out.println("Rerun the program and input correctly next time.");
        }
    }
}