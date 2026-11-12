public class BasicMembership extends Membership {
    private boolean hasGymAccess;

    public BasicMembership() {
        super();
        this.hasGymAccess = true;
    }

    public BasicMembership(String membershipID, String memberName, int durationMonths, boolean hasGymAccess) {
        super(membershipID, memberName, durationMonths);
        this.hasGymAccess = hasGymAccess;
    }

    public boolean hasGymAccess() {
        return hasGymAccess;
    }

    @Override
    public double calculateFee() {
        return 200 * getDurationMonths();
    }

    @Override
    public void displayMembershipDetails() {
        System.out.println("Membership ID: " + getMembershipID());
        System.out.println("Member Name: " + getMemberName());
        System.out.println("Duration: " + getDurationMonths() + " months");
        System.out.println("Gym Access: " + hasGymAccess);
        System.out.println("Total Fee: $" + calculateFee());
    }
}