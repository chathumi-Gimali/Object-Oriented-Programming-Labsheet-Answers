public class Calculator {

    // Adds two integers and returns the result
    public static int add(int a, int b) {
        return a + b;
    }

    // Multiplies two integers and returns the result
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Multiplies a number by itself
    public static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        // 1. (3 * 4 + 5 * 7)^2
        int expr1 = square(add(multiply(3, 4), multiply(5, 7)));
        System.out.println("(3*4 + 5*7)^2 = " + expr1);

        // 2. (4 + 7)^2 + (8 + 3)^2
        int expr2 = add(square(add(4, 7)), square(add(8, 3)));
        System.out.println("(4+7)^2 + (8+3)^2 = " + expr2);
    }
}
