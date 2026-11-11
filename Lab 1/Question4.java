public class Question4 {
    public static void main(String[] args) {
        // Figure 1: square of stars using a while loop (5 rows x 5 stars)
        System.out.println("Using while loop:");
        int row = 1;
        while (row <= 5) {
            int col = 1;
            while (col <= 5) {
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }

        System.out.println();

        // Figure 2: pyramid of stars using a for loop
        System.out.println("Using for loop:");
        for (int i = 1; i <= 5; i++) {
            // leading spaces so the rows line up in the middle
            for (int s = 1; s <= 5 - i; s++) {
                System.out.print("  ");
            }
            // i stars in this row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
