import java.util.*;

public class ShipCostCalculator
{
    public static void main(String[] args)
    {
        double price = 0;
        double shippingCost = 0;
        Scanner in = new Scanner(System.in);  
        System.out.println("Price: $");
        price = in.nextDouble();
        in.nextLine();
        if (price < 100)
        {
            shippingCost = price * .02;
        }
        System.out.println("Shipping cost: $" + shippingCost);
        price = price * (1 + shippingCost);
        System.out.println("Price with shipping cost: $" + price);
    }
}