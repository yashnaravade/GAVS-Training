import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble; // optionalDouble is used to handle empty list. If the list is empty, then it will return empty optionalDouble. If the list is not empty, then it will return the average of the list.

public class AverageCalculator {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Calculate the average using Java Streams
        OptionalDouble average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average();
        // Convert to IntStream. mapToInt() is used to convert Stream<Integer> to
        // IntStream. Integer::intValue is used to convert Integer to int. :: is called
        // method reference. It is used to refer to a method without executing it.

        if (average.isPresent()) {
            System.out.println("Average: " + average.getAsDouble());
        } else {
            System.out.println("The list is empty, cannot calculate the average.");
        }
    }
}

// Average: 5.5
