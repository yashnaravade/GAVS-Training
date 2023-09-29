import java.util.Scanner;

public class StringDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        // Convert the string to uppercase and print
        System.out.println("Uppercase: " + str.toUpperCase());
        
        // Convert the string to lowercase and print
        System.out.println("Lowercase: " + str.toLowerCase());
        
        // Find the index of the first occurrence of 'l' and print
        int firstIndex = str.indexOf("l");
        System.out.println("First 'l' at index: " + firstIndex);
        
        // Find the index of the last occurrence of 'l' and print
        int lastIndex = str.lastIndexOf("l");
        System.out.println("Last 'l' at index: " + lastIndex);
        
        // Extract a substring from index 2 to 4 (exclusive) and print
        String subStr = str.substring(2, 4);
        System.out.println("Substring from index 2 to 4: " + subStr);
        
        // Get the length of the string and print
        System.out.println("Length of the string: " + str.length());
        
        // Concatenate " World" to the string and print
        str = str.concat(" World");
        System.out.println("Concatenated with ' World': " + str);
        
        // Print the original string
        System.out.println("Original string: " + str);
        
        // Replace all 'l' with 'k' in the string and print
        str = str.replace('l', 'k');
        System.out.println("After replacing 'l' with 'k': " + str);
        
        // Set a new value for the string
        str = "Hello World";
        
        // Get the length of the string and print
        System.out.println("Length of the new string: " + str.length());
        
        // Trim any leading or trailing whitespace from the string
        str = str.trim();
        System.out.println("Trimmed string: " + str);
        
        // Check if the string contains "ll" and print the result
        boolean containsLL = str.contains("ll");
        System.out.println("Contains 'll': " + containsLL);
        
        // Convert the string to a character array and print each character
        char[] chars = str.toCharArray();
        System.out.println("Characters in the string:");
        for (char c : chars)
            System.out.println(c);
        
        sc.close(); // Close the scanner to prevent resource leak
    }
}
