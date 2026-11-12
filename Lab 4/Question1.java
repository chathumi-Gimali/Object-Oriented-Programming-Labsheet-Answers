public class Question1 {
    public static void main(String[] args) {
        // Create books using the three constructors
        Book book1 = new Book("Java Basics", "James Gosling");
        Book book2 = new Book("Data Structures", "Mark Allen", "1002");
        Book book3 = new Book("Clean Code", "Robert Martin", "1003", 45.50);

        System.out.println("=== All Book Details ===");
        System.out.println(book1.getBookDetails());
        System.out.println();
        System.out.println(book2.getBookDetails());
        System.out.println();
        System.out.println(book3.getBookDetails());

        System.out.println("\n=== Search by ISBN ===");
        String searchIsbn = "1003";
        System.out.println(book1.getBookDetails(searchIsbn));
        System.out.println(book2.getBookDetails(searchIsbn));
        System.out.println(book3.getBookDetails(searchIsbn));
    }
}