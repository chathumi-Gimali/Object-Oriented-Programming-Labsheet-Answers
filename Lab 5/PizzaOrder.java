public class PizzaOrder {
    private static final double DELIVERY_FEE = 5.00;
    private static final double TOPPING_PRICE = 1.50;

    private String orderID;
    private String customerName;
    private String size;
    private int toppingCount;
    private boolean isDelivery;

    // (b) Default constructor
    public PizzaOrder() {
        this.orderID = "N/A";
        this.customerName = "N/A";
        this.size = "Small";
        this.toppingCount = 0;
        this.isDelivery = false;
    }

    // (c-i) Only orderID and customerName
    public PizzaOrder(String orderID, String customerName) {
        this();
        this.orderID = orderID;
        this.customerName = customerName;
    }

    // (c-ii) All five attributes
    public PizzaOrder(String orderID, String customerName, String size, int toppingCount, boolean isDelivery) {
        this.orderID = orderID;
        this.customerName = customerName;
        setSize(size);
        setToppingCount(toppingCount);
        this.isDelivery = isDelivery;
    }

    public String getOrderID() {
        return orderID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getSize() {
        return size;
    }

    // (d) Only Small, Medium, or Large are accepted; anything else becomes Small
    public void setSize(String size) {
        String s = (size == null) ? "" : size.trim();
        if (s.equalsIgnoreCase("Small")) {
            this.size = "Small";
        } else if (s.equalsIgnoreCase("Medium")) {
            this.size = "Medium";
        } else if (s.equalsIgnoreCase("Large")) {
            this.size = "Large";
        } else {
            this.size = "Small";
        }
    }

    public int getToppingCount() {
        return toppingCount;
    }

    public void setToppingCount(int toppingCount) {
        this.toppingCount = (toppingCount < 0) ? 0 : toppingCount;
    }

    public boolean isDelivery() {
        return isDelivery;
    }

    public void setDelivery(boolean isDelivery) {
        this.isDelivery = isDelivery;
    }

    // (e) Base price from the size chart
    public double getBasePrice() {
        switch (size) {
            case "Medium": return 10.00;
            case "Large":  return 12.00;
            default:       return 8.00;
        }
    }

    // (f-i) Total using stored values: base + toppings + delivery fee (if chosen)
    public double calculateTotalPrice() {
        double total = getBasePrice() + toppingCount * TOPPING_PRICE;
        if (isDelivery) {
            total += DELIVERY_FEE;
        }
        return total;
    }

    // (f-ii) Same total, with a percentage discount applied
    public double calculateTotalPrice(double discountPercentage) {
        double total = calculateTotalPrice();
        return total - (total * discountPercentage / 100.0);
    }

    // (g) Preparation time: 15 minutes + 2 minutes per topping
    public int estimatePreparationTime() {
        return 15 + 2 * toppingCount;
    }

    // (h) Full order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer: " + customerName);
        System.out.println("Size: " + size);
        System.out.println("Toppings: " + toppingCount);
        System.out.println("Delivery: " + (isDelivery ? "Yes" : "No"));
        System.out.printf("Total Price: $%.2f%n", calculateTotalPrice());
        System.out.println("Estimated Preparation Time: " + estimatePreparationTime() + " minutes");
    }
}