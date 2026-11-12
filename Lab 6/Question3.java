public class Question3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle(10.0, 5.0);

        System.out.println("=== Rectangle (Default Constructor) ===");
        rectangle.displayShapeDetails();
        System.out.println("Scaled Area (factor 2): " + rectangle.calculateArea(2));
        System.out.println();

        System.out.println("=== Triangle (Parameterized Constructor) ===");
        triangle.displayShapeDetails();
        System.out.println("Scaled Area (factor 2): " + triangle.calculateArea(2));
    }
}