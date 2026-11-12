public class Product {
    private String productID;
    private String productName;
    private double basePrice;
    private String membershipType;

    // Constructor 1: ID and name only
    public Product(String productID, String productName) {
        this.productID = productID;
        this.productName = productName;
        this.basePrice = 0.0;
        this.membershipType = "Non-Member";
    }

    // Constructor 2: ID, name, and base price
    public Product(String productID, String productName, double basePrice) {
        this(productID, productName);
        this.basePrice = basePrice;
    }

    // Constructor 3: all four attributes
    public Product(String productID, String productName, double basePrice, String membershipType) {
        this(productID, productName, basePrice);
        setMembershipType(membershipType);
    }

    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        if (basePrice >= 0) {
            this.basePrice = basePrice;
        } else {
            System.out.println("Invalid base price. It cannot be negative.");
        }
    }

    public String getMembershipType() {
        return membershipType;
    }

    // Only Premium, Regular, or Non-Member are accepted; anything else becomes Non-Member
    public void setMembershipType(String membershipType) {
        String type = (membershipType == null) ? "" : membershipType.trim().toLowerCase();

        if (type.equals("premium") || type.equals("premium member")) {
            this.membershipType = "Premium Member";
        } else if (type.equals("regular") || type.equals("regular member")) {
            this.membershipType = "Regular Member";
        } else {
            this.membershipType = "Non-Member";
        }
    }

    // Membership discount as a whole-number percentage
    private int getMembershipDiscountPercent() {
        if (membershipType.equals("Premium Member")) {
            return 20;
        } else if (membershipType.equals("Regular Member")) {
            return 10;
        }
        return 0;
    }

    // Version 1: final price after the membership discount
    public double calculateFinalPrice() {
        return basePrice * (100 - getMembershipDiscountPercent()) / 100.0;
    }

    // Version 2: also subtracts a seasonal discount, without changing stored values
    public double calculateFinalPrice(double seasonalDiscount) {
        double price = calculateFinalPrice() - seasonalDiscount;
        return Math.max(price, 0);
    }

    public void displayProductDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Name: " + productName);
        System.out.println("Base Price: $" + basePrice);
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Final Price (after discount): $" + calculateFinalPrice());
    }
}