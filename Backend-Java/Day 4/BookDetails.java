import java.util.Scanner;

class Book {
    private int bookNo;
    private String title;
    private String author;
    private float price;
    private static int bookCount = 0;

    static {
        bookCount = 0;
    }

    public Book() {
        bookCount++;
    }

    public Book(int bookNo, String title, String author, float price) {
        this();
        this.bookNo = bookNo;
        this.title = title;
        this.author = author;
        if (validateTitle(title) && validatePrice(price)) {
            this.price = price;
        } else {
            System.out.println("Error: Invalid title or price");
        }
    }

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (validateTitle(title)) {
            this.title = title;
        } else {
            System.out.println("Error: Title must have at least 4 characters");
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (validatePrice(price)) {
            this.price = price;
        } else {
            System.out.println("Error: Price must be in the range 1 to 5000");
        }
    }

    public static int getBookCount() {
        return bookCount;
    }

    @Override
    public String toString() {
        return "Book Number: " + bookNo + "\nTitle: " + title + "\nAuthor: " + author + "\nPrice: " + price;
    }

    private boolean validateTitle(String title) {
        return title.length() >= 4;
    }

    private boolean validatePrice(float price) {
        return price >= 1 && price <= 5000;
    }
}

class EngineeringBook extends Book {
    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array of 3 Book objects
        Book[] books = new Book[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Book " + (i + 1));
            System.out.print("Book Number: ");
            int bookNo = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Price: ");
            float price = scanner.nextFloat();

            // Create a Book object and initialize it
            books[i] = new Book(bookNo, title, author, price);
        }

        // Display the total book count
        System.out.println("Total number of books: " + Book.getBookCount());

        // Search for a book by book number
        System.out.print("Enter a book number to search: ");
        int searchBookNo = scanner.nextInt();
        boolean found = false;
        for (Book book : books) { // Enhanced for loop (for-each loop). Here, book is a reference to each Book object in the books array and books is the array itself. The loop iterates over the array and assigns each Book object to the book reference.
            if (book.getBookNo() == searchBookNo) {
                System.out.println("Book Found!\n" + book);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found.");
        }

        scanner.close();
    }
}
