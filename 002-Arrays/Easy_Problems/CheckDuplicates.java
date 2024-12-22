
import java.util.HashMap;

public class CheckDuplicates {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int n = arr.length;
        System.out.println(checkDuplicate(arr, n));
    }

    public static boolean checkDuplicate(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], i);
            } else {
                return true;
            }
        }
        return false;
    }
}
