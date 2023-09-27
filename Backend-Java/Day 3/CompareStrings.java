public class CompareStrings {
    public static void main(String args[]) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        boolean areEqual1 = str1 == str2; // true (both point to the same memory location)
        boolean areEqual2 = str1 == str3; // false (str3 is a new object with a different memory location)
        boolean areEqual3 = str1.equals(str3); // true (str1 and str3 have the same value)

        System.out.println("areEqual1: " + areEqual1);
        System.out.println("areEqual2: " + areEqual2);
        System.out.println("areEqual3: " + areEqual3);

    }

}
