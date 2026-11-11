import java.util.Scanner;

public class ProductApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Product product = new Product();

        System.out.print("Enter Product ID: ");
        product.setProductId(Integer.parseInt(input.nextLine()));

        System.out.print("Enter Product Name: ");
        product.setProductName(input.nextLine());

        // Keep asking until the price is valid
        double price;
        do {
            System.out.print("Enter Price (greater than 0): ");
            price = Double.parseDouble(input.nextLine());
        } while (price <= 0);
        product.setPrice(price);

        // Keep asking until the quantity is valid
        int quantity;
        do {
            System.out.print("Enter Quantity (0 or more): ");
            quantity = Integer.parseInt(input.nextLine());
        } while (quantity < 0);
        product.setQuantity(quantity);

        product.displayDetails();
        System.out.println("Total Stock Value: " + product.calculateTotalValue());

        input.close();
    }
}