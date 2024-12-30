
public class OccuranceOfNumber {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        int target = 4;
        System.out.println(calculateCount(arr, target));
    }

    public static int calculateCount(int[] arr, int target) {
        int first = binarySearch(arr, target, true);
        int second = binarySearch(arr, target, false);
        if (first != -1 && second != -1) {
            return second - first + 1;
        } else {
            return 0;
        }
    }

    public static int binarySearch(int[] arr, int target, boolean leftSearch) {
        int count = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                count = mid;
                if (leftSearch) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return count;
    }
}
