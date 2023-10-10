import java.util.Collection;

import java.util.HashMap;

import java.util.Iterator;

import java.util.Map;

import java.util.Map.Entry;

import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {

        // TODO Auto-generated method stub

        Map<Integer, BookData> myBooks = new HashMap<Integer, BookData>();

        myBooks.put(1, new BookData(1, "Programming in C", "Ramki", 450));

        myBooks.put(2, new BookData(2, "C Data Structures", "Bala", 4500));

        myBooks.put(3, new BookData(3, "Java Programming", "Ravi", 3450));

        myBooks.put(4, new BookData(3, "Java Programming", "Ravi", 3450));

        System.out.println(myBooks);

        System.out.println(myBooks.get(2));

        System.out.println(myBooks.containsKey(4));

        Set<Integer> keys = myBooks.keySet();

        System.out.println("-------------");

        for (int i : keys)

            System.out.println(myBooks.get(i));

        Collection<BookData> books = myBooks.values();

        System.out.println("-------------");

        for (BookData b : books)

            System.out.println(b);

        System.out.println("-------------");

        Set<Entry<Integer, BookData>> entries = myBooks.entrySet();

        for (Entry<Integer, BookData> e : entries)

            System.out.println(e.getKey() + " " + e.getValue());

        System.out.println("-------------");

        // Set<Entry<Integer,BookData>> entries= myBooks.entrySet();

        Iterator<Entry<Integer, BookData>> it = entries.iterator();

        while (it.hasNext()) {

            Entry<Integer, BookData> e = it.next();

            System.out.println(e.getKey() + " " + e.getValue());

        }

    }

}