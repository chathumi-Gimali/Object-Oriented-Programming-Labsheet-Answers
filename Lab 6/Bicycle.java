public class Bicycle extends Vehicle {
    private int gearCount;
    private double maxPedalSpeed;

    public Bicycle() {
        super("Bicycle");
        this.gearCount = 1;
        this.maxPedalSpeed = 25.0;
    }

    public Bicycle(String vehicleName, int gearCount, double maxPedalSpeed) {
        super(vehicleName);
        this.gearCount = gearCount;
        this.maxPedalSpeed = maxPedalSpeed;
    }

    public int getGearCount() {
        return gearCount;
    }

    public double getMaxPedalSpeed() {
        return maxPedalSpeed;
    }

    @Override
    public double calculateSpeed() {
        return maxPedalSpeed;
    }

    @Override
    public void displayVehicleDetails() {
        System.out.println("Vehicle: " + getVehicleName());
        System.out.println("Gear Count: " + gearCount);
        System.out.println("Speed: " + calculateSpeed() + " km/h");
    }
}