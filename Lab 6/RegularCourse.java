public class RegularCourse extends Course {
    private boolean hasLiveSessions;

    public RegularCourse() {
        super();
        this.hasLiveSessions = false;
    }

    public RegularCourse(String courseID, String courseName, int durationWeeks, boolean hasLiveSessions) {
        super(courseID, courseName, durationWeeks);
        this.hasLiveSessions = hasLiveSessions;
    }

    public boolean hasLiveSessions() {
        return hasLiveSessions;
    }

    @Override
    public double calculateTotalFee() {
        return 100 * getDurationWeeks();
    }

    @Override
    public void displayCourseDetails() {
        System.out.println("Course ID: " + getCourseID());
        System.out.println("Course Name: " + getCourseName());
        System.out.println("Duration: " + getDurationWeeks() + " weeks");
        System.out.println("Live Sessions Included: " + hasLiveSessions);
        System.out.println("Total Fee: $" + calculateTotalFee());
    }
}