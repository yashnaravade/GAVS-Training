import java.util.Arrays;
import java.util.List;

public class CountStringsStartingWithLetter {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "grape", "avacado");

        // Specific letter to count strings starting with
        char letterToCount = 'a';

        long count = strings.stream()
                .filter(s -> s.startsWith(String.valueOf(letterToCount)))
                .count();

        System.out.println("Number of strings starting with '" + letterToCount + "': " + count);
    }
}
