import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Employee Type (1, 2, or 3): ");
        int employeeType = input.nextInt();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = input.nextDouble();

        System.out.print("Enter Overtime Hours: ");
        double otHours = input.nextDouble();

        // Assign the overtime rate based on employee type
        double otRate;
        if (employeeType == 1) {
            otRate = 1000;
        } else if (employeeType == 2) {
            otRate = 1500;
        } else if (employeeType == 3) {
            otRate = 1700;
        } else {
            System.out.println("Invalid employee type. Please enter 1, 2, or 3.");
            input.close();
            return;
        }

        double totalSalary = basicSalary + (otHours * otRate);
        System.out.println("Total Salary: " + totalSalary);

        input.close();
    }
}