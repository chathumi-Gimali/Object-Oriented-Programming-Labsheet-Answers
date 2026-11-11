public class Employee {
    private int employeeId;
    private String name;
    private double basicSalary;
    private int performanceRating;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        if (basicSalary > 0) {
            this.basicSalary = basicSalary;
        } else {
            System.out.println("Invalid salary. Basic salary must be greater than 0.");
        }
    }

    public int getPerformanceRating() {
        return performanceRating;
    }

    public void setPerformanceRating(int performanceRating) {
        if (performanceRating >= 1 && performanceRating <= 5) {
            this.performanceRating = performanceRating;
        } else {
            System.out.println("Invalid rating. Rating must be between 1 and 5.");
        }
    }

    // Bonus percentage depends on the performance rating
    public double calculateBonus() {
        int percent;
        switch (performanceRating) {
            case 5: percent = 20; break;
            case 4: percent = 15; break;
            case 3: percent = 10; break;
            case 2: percent = 5; break;
            default: percent = 0; break;
        }
        return basicSalary * percent / 100.0;
    }

    public double calculateTotalSalary() {
        return basicSalary + calculateBonus();
    }

    public void displayDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Performance Rating: " + performanceRating);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}