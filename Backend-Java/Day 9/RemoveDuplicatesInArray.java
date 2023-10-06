import java.util.*;

public class RemoveDuplicatesInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int newSize = removeDuplicates(arr);
        System.out.println("The array after removing duplicates is: ");
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    static int removeDuplicates(int[] nums) {

        if (nums.length == 0)
            return 0;

        int i = 0, j;

        for (j = 1; j < nums.length; j++) {

            if (nums[i] != nums[j])
                i++;

            nums[i] = nums[j];

        }
        return i + 1;

    }
}
