import java.util.HashMap;

import java.util.LinkedHashMap;

import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        // TODO Auto-generated method stub

            // HashMap<Integer, BookData> books = new HashMap<Integer, BookData>();
        // TreeMap<Integer, BookData> books = new TreeMap<Integer, BookData>();
        LinkedHashMap<Integer, BookData> books = new LinkedHashMap<Integer, BookData>();
    

        books.put(4, new BookData(4, "Python Programming", "Neena", 3210));

        books.put(1, new BookData(1, "Programming in C", "Ramki", 450));

        books.put(2, new BookData(2, "C Data Structures", "Bala", 4500));

        books.put(3, new BookData(3, "Java Programming", "Ravi", 3450));

        books.put(null, new BookData(4, "Python Programming", "Neena", 3210));

        books.put(null, new BookData(5, "Python Programming", "Neena", 3210));

        books.put(4, null);

        System.out.println(books);

    }

}