import java.util.Set;
import java.util.TreeSet;

public class SetDemo2 {

    public static void main(String[] args) {
        Set<Book> mySet = new TreeSet<>();
        mySet.add(new Book(1, "Programming in C", "Ramki", 450));
        mySet.add(new Book(2, "C Data Structures", "Bala", 4500));
        mySet.add(new Book(3, "Java Programming", "Ravi", 3450));

        for (Book book : mySet) {
            System.out.println(book);
        }
    }
}

class Book implements Comparable<Book> {
    private int id;
    private String title;
    private String author;
    private double price;

    public Book(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public int compareTo(Book otherBook) {
        // Compare books based on their prices in ascending order
        if (this.price < otherBook.price) {
            return -1;
        } else if (this.price > otherBook.price) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + "]";
    }
}
