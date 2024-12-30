
public class FirstAndLastOcc {

    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 10, 10, 10, 18, 20};
        int target = 10;
        int[] occ = firstAndLastOcc(arr, target);
        for (int i : occ) {
            System.out.println(i);
        }
    }

    public static int[] firstAndLastOcc(int[] arr, int target) {
        return new int[]{binarySearch(arr, target, true), binarySearch(arr, target, false)};
    }

    public static int binarySearch(int[] arr, int target, boolean searchLeft) {
        int start = 0;
        int end = arr.length - 1;
        int res = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == arr[mid]) {
                res = mid;
                if (searchLeft) {
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
        return res;
    }

    public static int LastOccbinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int res = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == arr[mid]) {
                res = mid;
                start = mid + 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }
}
