
public class LargestElement {

    public static void main(String[] args) {
        int arr[] = {5, 5, 5, 5};
        int n = arr.length;
        int largestElement = findLargestElement(arr, n);
        System.out.println(largestElement);
    }

    //Optimal Solution
    //Best case TC - O(1);
    //Worst case TC - O(n);
    public static int findLargestElement(int arr[], int n) {
        if (n == 1) {
            return arr[0];
        }
        int largest = arr[0];
        for (int i = 1; i < n; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
