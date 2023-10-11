import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCaseConverter {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "Banana", "cherry", "Date", "grape");

        // Convert to uppercase
        List<String> upperCaseStrings = strings.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Uppercase: " + upperCaseStrings);

        // Convert to lowercase
        List<String> lowerCaseStrings = strings.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println("Lowercase: " + lowerCaseStrings);
    }
}
