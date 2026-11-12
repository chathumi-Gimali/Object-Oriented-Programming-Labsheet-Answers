public class Course {
    private String courseID;
    private String courseName;
    private int durationWeeks;

    public Course() {
        this.courseID = "N/A";
        this.courseName = "N/A";
        this.durationWeeks = 0;
    }

    public Course(String courseID, String courseName, int durationWeeks) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.durationWeeks = durationWeeks;
    }

    public String getCourseID() {
        return courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getDurationWeeks() {
        return durationWeeks;
    }

    public void displayCourseDetails() {
        System.out.println("Course ID: " + courseID);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + durationWeeks + " weeks");
    }

    // Basic course fee
    public double calculateTotalFee() {
        return 10000.00;
    }

    // Fee after a percentage discount, using calculateTotalFee() as the base
    public double calculateTotalFee(double discountPercentage) {
        double basicFee = calculateTotalFee();
        return basicFee - (basicFee * discountPercentage / 100.0);
    }
}