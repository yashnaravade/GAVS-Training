import java.util.Date;

import java.util.Iterator;

import java.util.ArrayList;

import java.util.List;

public class ListDemo {

    public static void main(String[] args) throws InvalidDataException {

        List<BookData> myList = new ArrayList<BookData>();

        myList.add(new BookData(1, "Programming in C", "Ramki", 450));

        myList.add(new BookData(2, "C Data Structures", "Bala", 4500));

        myList.add(new BookData(3, "Java Programming", "Ravi", 3450));

        myList.add(new BookData(4, "Python Programming", "Neena", 3210));

        for (BookData o : myList) {

            System.out.println(o);
            ;

        }

        List<BookData> newList = myList.stream().filter(e -> e.getPrice() > 3000).map(
                e -> new BookData(e.getBookNo(), e.getTitle().toUpperCase(), e.getAuthor().toUpperCase(), e.getPrice()))
                .toList();

        System.out.println(newList);

    }

}   