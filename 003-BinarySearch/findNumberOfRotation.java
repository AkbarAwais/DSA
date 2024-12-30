
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findNumberOfRotation {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(11, 12, 15, 18, 2, 5, 6, 8));
        System.out.println(findKRotation(list));
    }

    public static int findKRotation(List<Integer> arr) {
        int n = arr.size();
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            int next = (mid + 1) % n;
            int prev = (mid + n - 1) % n;
            if (arr.get(mid) <= arr.get(prev) && arr.get(mid) <= arr.get(next)) {
                return mid;
            }
            if (arr.get(0) <= arr.get(mid)) {
                start = mid + 1;
            } else if (arr.get(mid) <= arr.get(n-1)) {
                end = mid - 1;
            }
        }
        return 0;
    }
}
