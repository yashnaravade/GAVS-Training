import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageCalculator {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Calculate the average using Java Streams
        OptionalDouble average = numbers.stream()
                .mapToInt(Integer::intValue) // Convert to IntStream
                .average();

        if (average.isPresent()) {
            System.out.println("Average: " + average.getAsDouble());
        } else {
            System.out.println("The list is empty, cannot calculate the average.");
        }
    }
}

// Average: 5.5
