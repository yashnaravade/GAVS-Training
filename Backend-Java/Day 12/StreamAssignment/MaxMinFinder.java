import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class MaxMinFinder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 6, 2, 9, 3, 8, 5, 7);

        // Find the maximum value using streams
        OptionalInt max = numbers.stream()
                .mapToInt(Integer::intValue)
                .max();

        if (max.isPresent()) {
            System.out.println("Maximum value: " + max.getAsInt());
        } else {
            System.out.println("The list is empty, cannot find the maximum.");
        }

        // Find the minimum value using streams
        OptionalInt min = numbers.stream()
                .mapToInt(Integer::intValue)
                .min();

        if (min.isPresent()) {
            System.out.println("Minimum value: " + min.getAsInt());
        } else {
            System.out.println("The list is empty, cannot find the minimum.");
        }
    }
}
