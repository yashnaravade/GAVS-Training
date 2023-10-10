import java.util.*;

public class SetDemoChoice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sorting criteria (price/title/author): ");
        String criteria = scanner.nextLine().toLowerCase();

        if (criteria.equals("price")) {
            // Sort by price
            Set<Book> mySet = new TreeSet<>(new BookComparatorByPrice());
            populateSet(mySet);
            printBooks(mySet);
        } else if (criteria.equals("title")) {
            // Sort by title
            Set<Book> mySet = new TreeSet<>(new BookComparatorByTitle());
            populateSet(mySet);
            printBooks(mySet);
        } else {
            System.out.println("Invalid sorting criteria. Please enter 'price' or 'title'.");
        }

        scanner.close();
    }

    private static void populateSet(Set<Book> mySet) {
        mySet.add(new Book(1, "Programming in C", "Ramki", 450));
        mySet.add(new Book(2, "C Data Structures", "Bala", 4500));
        mySet.add(new Book(3, "Java Programming", "Ravi", 3450));
    }

    private static void printBooks(Set<Book> bookSet) {
        for (Book book : bookSet) {
            System.out.println(book);
        }
    }
}

class Book {
    // ...

    // Constructor and other methods remain the same
}

class BookComparatorByPrice implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return Double.compare(book1.getPrice(), book2.getPrice());
    }
}

class BookComparatorByTitle implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getTitle().compareTo(book2.getTitle());
    }
}
