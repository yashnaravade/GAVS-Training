public class StringMethodsDemo {

    public static void main(String[] args) {
        // Creating a sample string
        String text = "Hello, World!";

        // Length of the string
        int length = text.length();
        System.out.println("Length of the string: " + length);

        // Convert to lowercase and uppercase
        String lowercase = text.toLowerCase();
        String uppercase = text.toUpperCase();
        System.out.println("Lowercase: " + lowercase);
        System.out.println("Uppercase: " + uppercase);

        // Substring
        String substring = text.substring(7); // Extracts from index 7 to the end
        System.out.println("Substring from index 7: " + substring);

        // Concatenation
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // Replace
        String replacedText = text.replace("World", "Java");
        System.out.println("Replaced Text: " + replacedText);

        // Split
        String csvData = "Alice,Bob,Carol,David";
        String[] names = csvData.split(",");
        System.out.print("Split Names: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();

        // Trim
        String paddedText = "   Trim me   ";
        String trimmedText = paddedText.trim();
        System.out.println("Trimmed Text: " + trimmedText);

        // Check if a string contains a substring
        boolean containsJava = text.contains("Java");
        System.out.println("Contains 'Java': " + containsJava);

        // Check if a string starts with and ends with a substring
        boolean startsWithHello = text.startsWith("Hello");
        boolean endsWithWorld = text.endsWith("World");
        System.out.println("Starts with 'Hello': " + startsWithHello);
        System.out.println("Ends with 'World': " + endsWithWorld);
    }
}
