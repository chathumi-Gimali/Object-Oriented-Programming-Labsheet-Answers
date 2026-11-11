public class Demo {
    public static void main(String[] args) {
        EvenOddNumber obj = new EvenOddNumber();

        int[] numbers = {4, 7, 10, 15};

        for (int n : numbers) {
            if (obj.findEvenOrOdd(n)) {
                System.out.println(n + " is an even number");
            } else {
                System.out.println(n + " is an odd number");
            }
        }
    }
}
