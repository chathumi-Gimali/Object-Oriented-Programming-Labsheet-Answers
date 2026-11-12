public class Driver {
    private String driverID;
    private String driverName;
    private double baseSalary;
    private int performanceScore;

    // Constructor 1: ID and name only
    public Driver(String driverID, String driverName) {
        this.driverID = driverID;
        this.driverName = driverName;
        this.baseSalary = 0.0;
        this.performanceScore = 1;
    }

    // Constructor 2: base salary only
    public Driver(double baseSalary) {
        this.driverID = "Not assigned";
        this.driverName = "Not assigned";
        this.baseSalary = baseSalary;
        this.performanceScore = 1;
    }

    // Constructor 3: all four attributes
    public Driver(String driverID, String driverName, double baseSalary, int performanceScore) {
        this.driverID = driverID;
        this.driverName = driverName;
        this.baseSalary = baseSalary;
        setPerformanceScore(performanceScore);
    }

    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getPerformanceScore() {
        return performanceScore;
    }

    // Scores outside 1 to 5 default to 1
    public void setPerformanceScore(int performanceScore) {
        if (performanceScore >= 1 && performanceScore <= 5) {
            this.performanceScore = performanceScore;
        } else {
            this.performanceScore = 1;
        }
    }

    // Bonus percentage for a given score
    private int getBonusPercent(int score) {
        switch (score) {
            case 5: return 25;
            case 4: return 20;
            case 3: return 15;
            case 2: return 10;
            case 1: return 5;
            default: return 0;
        }
    }

    // Version 1: bonus based on the stored performance score
    public double calculateBonus() {
        return baseSalary * getBonusPercent(performanceScore) / 100.0;
    }

    // Version 2: bonus based on a custom score, without changing the stored score
    public double calculateBonus(int customScore) {
        return baseSalary * getBonusPercent(customScore) / 100.0;
    }

    public double calculateTotalSalary() {
        return baseSalary + calculateBonus();
    }

    public void displayDetails() {
        System.out.println("Driver ID: " + driverID);
        System.out.println("Name: " + driverName);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Performance Score: " + performanceScore);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}