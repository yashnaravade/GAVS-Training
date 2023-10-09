import java.util.Date;

import java.util.Iterator;

import java.util.ArrayList;

import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        List myList = new ArrayList();

        myList.add(5);

        myList.add("Hello");

        myList.add(new Date());

        System.out.println(myList);

        myList.add(2, "Welcome");

        System.out.println(myList);

        System.out.println(myList.indexOf("Welcome"));

        System.out.println(myList.contains("Hello"));

        // myList.remove(2);

        System.out.println(myList);

        myList.set(1, "New Element");

        System.out.println(myList);

        // Iterate with loop

        System.out.println("Print with loop");

        for (Object i : myList)

            System.out.println(i);

        System.out.println("Print with Iterator");

        Iterator it = myList.iterator();

        while (it.hasNext())

            System.out.println(it.next());

    }

}