import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondSmallestLargestFinder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 4, 7, 21, 6, 15, 8, 31, 17);

        // Find the second smallest and second largest using streams
        List<Integer> sortedList = numbers.stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        if (sortedList.size() >= 2) {
            int secondSmallest = sortedList.get(1);
            int secondLargest = sortedList.get(sortedList.size() - 2);

            System.out.println("Second Smallest: " + secondSmallest);
            System.out.println("Second Largest: " + secondLargest);
        } else {
            System.out.println("There are not enough distinct elements in the list to find the second smallest and second largest.");
        }
    }
}
