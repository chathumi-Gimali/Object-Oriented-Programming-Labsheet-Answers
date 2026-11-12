public class Shape {
    private String shapeName;

    public Shape() {
        this.shapeName = "Unknown Shape";
    }

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void displayShapeDetails() {
        System.out.println("Shape: " + shapeName);
    }

    // Default area
    public double calculateArea() {
        return 0.0;
    }

    // Scales the area by the given factor
    public double calculateArea(double factor) {
        return calculateArea() * factor;
    }
}