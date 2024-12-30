
class LowerBound {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 5, 8, 10, 10, 11};
        int k = 9;
        System.out.println(lowerBound(arr, k));
    }

    public static int lowerBound(int[] arr, int k) {
        int ans = arr.length;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

}
