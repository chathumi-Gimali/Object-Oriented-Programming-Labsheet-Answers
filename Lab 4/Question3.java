public class Question3 {
    public static void main(String[] args) {
        // Constructor 3: all four attributes
        Driver driver1 = new Driver("D1001", "John Smith", 4000.0, 5);

        // Constructor 1: ID and name, then set the salary and score
        Driver driver2 = new Driver("D1002", "Emily Davis");
        driver2.setBaseSalary(3500.0);
        driver2.setPerformanceScore(3);

        // Constructor 2: base salary only, then set the ID, name, and score
        Driver driver3 = new Driver(5000.0);
        driver3.setDriverID("D1003");
        driver3.setDriverName("Michael Johnson");
        driver3.setPerformanceScore(1);

        driver1.displayDetails();
        System.out.println();
        driver2.displayDetails();
        System.out.println();
        driver3.displayDetails();
        System.out.println();

        System.out.println("Bonus for driver3 with custom rating 4: " + driver3.calculateBonus(4));
    }
}