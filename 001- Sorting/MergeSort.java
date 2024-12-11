
import java.util.ArrayList;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {6, 4, 2, 6, 7, 1, 52, 67, 8};
        int n = arr.length;
        mergeSort(arr, 0, n-1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void mergeSort(int arr[], int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    public static void merge(int arr[], int left, int mid, int right) {
        ArrayList<Integer> arrList = new ArrayList<>();
        int low = left;
        int high = mid + 1;
        while (low <= mid && high <= right) {
            if (arr[low] <= arr[high]) {
                arrList.add(arr[low]);
                low++;
            } else {
                arrList.add(arr[high]);
                high++;
            }
        }
        while (low <= mid) {
            arrList.add(arr[low]);
            low++;
        }
        while (high <= right) {
            arrList.add(arr[high]);
            high++;
        }

        for (int i = left; i <= right; i++) {
            arr[i] = arrList.get(i - left);
        }
    }
}
