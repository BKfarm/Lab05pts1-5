public class Main
{
    public static void main(String[] args)
    {
        double price = 0;
        double salesTax = 0;
        System.out.println("Price: $" + price);
        System.out.println("Sales Tax: " + (100 * salesTax) + "%");
        price = price * (1 + salesTax);
        System.out.println("Price with sales tax: $" + price);
    }
}