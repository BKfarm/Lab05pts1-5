import java.util.*;

public class PartyAffiliation 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String party = "";
        System.out.println("What is your political party affiliation [D,R,I,Other]?");
        party = in.nextLine();
        if (party.equals("D"))
        {
            System.out.println("You get a Democratic Donkey.");
        } else {
            if (party.equals("R"))
            {
                System.out.println("You get a Republican Elephant.");
            } else {
                if (party.equals("I"))
                {
                    System.out.println("You get an Independent Man.");
                } else {
                    System.out.println("You entered a party this program does not check for.");
                }
            }
        }
    }
}
