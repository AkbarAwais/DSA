
class ReverseBS {

    public static void main(String[] args) {
        int arr[] = {20, 17, 15, 14, 13, 12, 10, 9, 8, 4};
        int target = 44;
        System.out.println(reverseBS(arr, target));
    }

    public static int reverseBS(int[] arr, int target) {
        int start = arr.length - 1;
        int end = 0;
        while (end <= start) {
            int mid = (end + start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid - 1;
            } else {
                end = mid + 1;
            }
        }
        return -1;
    }
}
