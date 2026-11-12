public class Question2 {
    public static void main(String[] args) {
        // Constructor 3: all four attributes
        Product laptop = new Product("P1001", "Laptop", 1000.0, "Premium Member");

        // Constructor 2: ID, name, and base price, then set the membership
        Product smartphone = new Product("P1002", "Smartphone", 600.0);
        smartphone.setMembershipType("Regular Member");

        // Constructor 1: ID and name only, then set the price and membership
        Product headphones = new Product("P1003", "Headphones");
        headphones.setBasePrice(200.0);
        headphones.setMembershipType("Non-Member");

        laptop.displayProductDetails();
        System.out.println();
        smartphone.displayProductDetails();
        System.out.println();
        headphones.displayProductDetails();
        System.out.println();

        System.out.println("Estimated price for Smartphone with extra $5 seasonal discount: $"
                + smartphone.calculateFinalPrice(5.0));
    }
}