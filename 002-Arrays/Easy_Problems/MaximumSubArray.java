
public class MaximumSubArray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        calulateMaxSubArray(arr, n);
    }

    public static void printSubArray(int arr[], int n) {
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // Kadane Algorithm - O(n)
    public static void calulateMaxSubArray(int arr[], int n) {
        int max = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < n; i++) {
            currSum += arr[i];
            max = Math.max(max, currSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        System.out.println("Max subarray = " + max);
    }
}
