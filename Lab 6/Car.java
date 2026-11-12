public class Car extends Vehicle {
    private int engineCapacity;
    private double topSpeed;

    public Car() {
        super("Car");
        this.engineCapacity = 1000;
        this.topSpeed = 150.0;
    }

    public Car(String vehicleName, int engineCapacity, double topSpeed) {
        super(vehicleName);
        this.engineCapacity = engineCapacity;
        this.topSpeed = topSpeed;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    @Override
    public double calculateSpeed() {
        return topSpeed;
    }

    @Override
    public void displayVehicleDetails() {
        System.out.println("Vehicle: " + getVehicleName());
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
        System.out.println("Speed: " + calculateSpeed() + " km/h");
    }
}