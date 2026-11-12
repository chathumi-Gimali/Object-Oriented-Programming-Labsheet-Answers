import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First order
        PizzaOrder order1 = new PizzaOrder("03001", "Olivia Green", "Medium", 3, true);
        order1.displayOrderDetails();
        System.out.println();

        // Second order with discount
        PizzaOrder order2 = new PizzaOrder("03002", "Noah Smith", "Large", 2, false);
        order2.displayOrderDetails();
        System.out.print("Enter the discount percentage: ");
        double percentage = sc.nextDouble();
        System.out.printf("Order 02 - Price after the discount: $%.2f%n",
                order2.calculateTotalPrice(percentage));
        System.out.println();

        // Third order using the default constructor
        PizzaOrder order3 = new PizzaOrder();
        order3.displayOrderDetails();

        sc.close();
    }
}