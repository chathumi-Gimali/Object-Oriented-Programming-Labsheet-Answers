import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 integer values:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        int largest = numbers[0];
        int sum = 0;

        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
            sum += number;
        }

        System.out.println("Largest value: " + largest);
        System.out.println("Sum of elements: " + sum);

        input.close();
    }
}