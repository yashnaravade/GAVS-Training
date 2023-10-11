import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "grape", "avacado", "orange");

        // Sort strings in alphabetical order (ascending)
        List<String> ascendingSorted = strings.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Ascending order: " + ascendingSorted);

        // Sort strings in alphabetical order (descending)
        List<String> descendingSorted = strings.stream()
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());

        System.out.println("Descending order: " + descendingSorted);
    }
}
