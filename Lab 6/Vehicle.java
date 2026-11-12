public class Vehicle {
    private String vehicleName;

    public Vehicle() {
        this.vehicleName = "Unknown Vehicle";
    }

    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void displayVehicleDetails() {
        System.out.println("Vehicle: " + vehicleName);
    }

    // Default speed
    public double calculateSpeed() {
        return 0.0;
    }

    // Scales the speed by the given factor
    public double calculateSpeed(double factor) {
        return calculateSpeed() * factor;
    }
}