public class Question4 {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle("Mountain Bike", 21, 45.0);

        System.out.println("=== Car (Default Constructor) ===");
        car.displayVehicleDetails();
        System.out.println("Scaled Speed (factor 0.5): " + car.calculateSpeed(0.5) + " km/h");
        System.out.println();

        System.out.println("=== Bicycle (Parameterized Constructor) ===");
        bicycle.displayVehicleDetails();
        System.out.println("Scaled Speed (factor 0.5): " + bicycle.calculateSpeed(0.5) + " km/h");
    }
}