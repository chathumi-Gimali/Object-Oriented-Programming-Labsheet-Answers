public class Membership {
    private String membershipID;
    private String memberName;
    private int durationMonths;

    public Membership() {
        this.membershipID = "N/A";
        this.memberName = "N/A";
        this.durationMonths = 0;
    }

    public Membership(String membershipID, String memberName, int durationMonths) {
        this.membershipID = membershipID;
        this.memberName = memberName;
        this.durationMonths = durationMonths;
    }

    public String getMembershipID() {
        return membershipID;
    }

    public String getMemberName() {
        return memberName;
    }

    public int getDurationMonths() {
        return durationMonths;
    }

    public void displayMembershipDetails() {
        System.out.println("Membership ID: " + membershipID);
        System.out.println("Member Name: " + memberName);
        System.out.println("Duration: " + durationMonths + " months");
    }

    // Base membership fee
    public double calculateFee() {
        return 5000.00;
    }

    // Fee after a percentage discount, using calculateFee() as the base
    public double calculateFee(double discountPercentage) {
        double baseFee = calculateFee();
        return baseFee - (baseFee * discountPercentage / 100.0);
    }
}