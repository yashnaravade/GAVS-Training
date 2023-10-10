import java.util.ArrayDeque;

import java.util.Deque;

public class DequeueDemo {

    public static void main(String[] args) {

        // TODO Auto-generated method stub

        Deque<BookData> myBooks = new ArrayDeque<BookData>(50);

        myBooks.add(new BookData(1, "Programming in C", "Ramki", 450));

        myBooks.add(new BookData(2, "C Data Structures", "Bala", 4500));

        // myBooks.off

        System.out.println(myBooks.size());

        for (BookData b : myBooks)

            System.out.println(b);

        System.out.println("----------");

        myBooks.offerFirst(new BookData(3, "Java Programming", "Ravi", 3450));

        myBooks.offerLast(new BookData(4, "Python Programming", "Neena", 3210));

        for (BookData b : myBooks)

            System.out.println(b);

        System.out.println("----------");

        System.out.println(myBooks.pollLast());

        System.out.println("----------");

        for (BookData b : myBooks)

            System.out.println(b);

    }

}