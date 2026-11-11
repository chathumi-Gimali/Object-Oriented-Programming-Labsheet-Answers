public class Question1 {
    public static void main(String[] args) {
        // a) Declare variables
        int miles;
        int yards;
        double kilometers;

        // b) Initialize: a marathon is 26 miles and 385 yards
        miles = 26;
        yards = 385;

        // c) + d) Expression to convert miles and yards to kilometers
        // 1 mile = 1760 yards, 1 mile = 1.609 km
        kilometers = (miles + yards / 1760.0) * 1.609;

        System.out.println("A marathon is " + kilometers + " km");
    }
}
