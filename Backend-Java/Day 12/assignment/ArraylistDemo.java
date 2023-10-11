import java.util.*;

public class ArraylistDemo {
    public static void main(String[] args) {
        Student student = new Student();

        student.setNames();

        student.searchName("Yash");

        student.searchName(1);

        System.out.println("employee names:");

        student.printNames();

        student.removeName("Aarya");

        System.out.println("Updated employee names:");

        student.printNames();

    }

}

class Student {

    private ArrayList<String> names = new ArrayList<>();

    public void setNames() {

        names.add("Raj");

        names.add("Yash");

        names.add("Aarya");

    }

    public void searchName(String name) {

        if (names.contains(name)) {

            System.out.println(name + " is a employee.");

        } else {

            System.out.println(name + " is not found in the list.");

        }

    }

    public void searchName(int index) {

        if (index >= 0 && index < names.size()) {

            System.out.println("employee at index " + index + ": " + names.get(index));

        } else {

            System.out.println("Index out of bounds.");

        }

    }

    public void printNames() {

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {

            System.out.println(iterator.next());

        }

    }

    public void removeName(String stuName) {

        if (names.remove(stuName)) {

            System.out.println(stuName + " is removed from the list ");

        } else {

            System.out.println(stuName + " is not found ");

        }

    }

}