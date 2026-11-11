public class Question2 {
    public static void main(String[] args) {
        int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};
        int[] C = new int[5];

        // Add the matching elements of A and B
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] + B[i];
        }

        // Print array C
        System.out.print("Array C: [");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i]);
            if (i < C.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
