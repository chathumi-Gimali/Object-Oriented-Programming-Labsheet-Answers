public class PremiumMembership extends Membership {
    private static final double PERSONAL_TRAINING_FEE = 100.0;
    private boolean includePersonalTraining;

    public PremiumMembership() {
        super();
        this.includePersonalTraining = false;
    }

    public PremiumMembership(String membershipID, String memberName, int durationMonths, boolean includePersonalTraining) {
        super(membershipID, memberName, durationMonths);
        this.includePersonalTraining = includePersonalTraining;
    }

    public boolean includePersonalTraining() {
        return includePersonalTraining;
    }

    @Override
    public double calculateFee() {
        double fee = 300 * getDurationMonths();
        if (includePersonalTraining) {
            fee += PERSONAL_TRAINING_FEE;
        }
        return fee;
    }

    @Override
    public void displayMembershipDetails() {
        System.out.println("Membership ID: " + getMembershipID());
        System.out.println("Member Name: " + getMemberName());
        System.out.println("Duration: " + getDurationMonths() + " months");
        System.out.println("Personal Training Included: " + includePersonalTraining);
        System.out.println("Total Fee: $" + calculateFee());
    }
}