public class Main
{
    public static void main(String[] args)
    {
        double itemPrice = 0.00;
        double shipCost = 0.05;
        double totalCost = 0.00;

        System.out.println("Enter the item price: ");
        totalCost = itemPrice * shipCost;
        System.out.println("Your item price is: " + itemPrice);
        System.out.println("Your total cost is: " + totalCost);
    }
}