import java.util.Hashtable;

public class HashTableDemo {

    public static void main(String[] args) {

        Hashtable<Integer, BookData> books = new Hashtable<Integer, BookData>();

        books.put(1, new BookData(1, "Programming in C", "Ramki", 450));

        books.put(2, new BookData(2, "C Data Structures", "Bala", 4500));

        books.put(3, new BookData(3, "Java Programming", "Ravi", 3450));

        // books.put(null, new BookData(4,"Python Programming","Neena",3210));

        // books.put(4, null); // null values not allowed

        System.out.println(books.get(2));

    }

}