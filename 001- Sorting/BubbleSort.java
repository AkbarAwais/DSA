
public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 6};
        int n = arr.length;
        for (int i = n - 1; i >= 1; i--) {
            boolean swap = false;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
