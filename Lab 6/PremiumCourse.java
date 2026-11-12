public class PremiumCourse extends Course {
    private static final double CERTIFICATION_FEE = 50.0;
    private boolean includeCertification;

    public PremiumCourse() {
        super();
        this.includeCertification = false;
    }

    public PremiumCourse(String courseID, String courseName, int durationWeeks, boolean includeCertification) {
        super(courseID, courseName, durationWeeks);
        this.includeCertification = includeCertification;
    }

    public boolean includeCertification() {
        return includeCertification;
    }

    @Override
    public double calculateTotalFee() {
        double fee = 150 * getDurationWeeks();
        if (includeCertification) {
            fee += CERTIFICATION_FEE;
        }
        return fee;
    }

    @Override
    public void displayCourseDetails() {
        System.out.println("Course ID: " + getCourseID());
        System.out.println("Course Name: " + getCourseName());
        System.out.println("Duration: " + getDurationWeeks() + " weeks");
        System.out.println("Certification Included: " + includeCertification);
        System.out.println("Total Fee: $" + calculateTotalFee());
    }
}