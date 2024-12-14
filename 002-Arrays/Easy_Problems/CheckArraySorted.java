
public class CheckArraySorted {

    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 1, 2};
        int n = arr.length;
        boolean largestElement = checkArrayOptimal(arr, n);
        System.out.println(largestElement);
    }

    //Brute Force
    //TC - O(N*2)
    public static boolean checkArraySorted(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (arr[i] > arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    //Optimal Solution
    //TC - O(N)
    public static boolean checkArrayOptimal(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
