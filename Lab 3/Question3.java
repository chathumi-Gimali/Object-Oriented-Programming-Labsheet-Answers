import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Enter Employee ID: ");
        employee.setEmployeeId(Integer.parseInt(input.nextLine()));

        System.out.print("Enter Employee Name: ");
        employee.setName(input.nextLine());

        System.out.print("Enter Basic Salary: ");
        employee.setBasicSalary(Double.parseDouble(input.nextLine()));

        // Keep asking until the rating is in the valid range
        int rating;
        do {
            System.out.print("Enter Performance Rating (1-5): ");
            rating = Integer.parseInt(input.nextLine());
        } while (rating < 1 || rating > 5);
        employee.setPerformanceRating(rating);

        employee.displayDetails();

        input.close();
    }
}