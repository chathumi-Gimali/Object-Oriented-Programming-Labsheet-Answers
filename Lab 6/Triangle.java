public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle() {
        super("Triangle");
        this.base = 0.0;
        this.height = 0.0;
    }

    public Triangle(double base, double height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    public void displayShapeDetails() {
        System.out.println("Shape: " + getShapeName());
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Area: " + calculateArea());
    }
}