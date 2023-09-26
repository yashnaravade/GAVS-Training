public class SumOf2dArray {
    public static void main(String args[]) {
        int[][] arr = { { 3, 4, 5 }, { 6, 8, 4 } };
        int i, j, sum = 0;

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Sum of the array elements is: " + sum);
    }
}
