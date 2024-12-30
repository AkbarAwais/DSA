
public class LongestSubArrayk {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int k = 3;
        System.out.println(findLongest(arr, k));
    }

    public static int findLongest(int[] arr, int k) {
        int maxLen = 0;
        int sum = arr[0];
        int i = 0;
        int j = 0;
        while (j < arr.length) {
            while (i <= j && sum > k) {
                sum -= arr[i];
                i++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, j - i + 1);
            }
            j++;
            if (j < arr.length) {
                sum += arr[j];
            }

        }
        return maxLen;
    }
}
