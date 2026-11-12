public class Book {
    private String title;
    private String author;
    private String isbn;
    private double price;

    // Constructor I: title and author only
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isbn = "Not provided";
        this.price = 0.0;
    }

    // Constructor II: title, author, and ISBN
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = 0.0;
    }

    // Constructor III: all four attributes
    public Book(String title, String author, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

    // getBookDetails() with no parameters: returns all details
    public String getBookDetails() {
        return "Title: " + title + "\nAuthor: " + author
                + "\nISBN: " + isbn + "\nPrice: $" + price;
    }

    // getBookDetails(isbn): returns details only if the ISBN matches
    public String getBookDetails(String isbn) {
        if (this.isbn.equals(isbn)) {
            return getBookDetails();
        }
        return "No book found with ISBN " + isbn;
    }
}