
import java.util.ArrayList;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int n = arr.length;
        prefixSuffixProduct(arr, n);
    }

    //Brute force O(n2)
    public static void product(int arr[], int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    product *= arr[j];
                }
            }
            list.add(product);
        }
        System.out.println(list);
    }

    //Better solution TC- 0{n} SC - O{n}
    public static void prefixProduct(int arr[], int n) {
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] finalArr = new int[n];
        prefix[0] = 1;
        suffix[arr.length - 1] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * arr[i - 1];
        }
        for (int j = arr.length - 2; j >= 0; j--) {
            suffix[j] = suffix[j + 1] * arr[j + 1];
        }
        for (int k = 0; k < n; k++) {
            finalArr[k] = prefix[k] * suffix[k];
        }
        for (int j : finalArr) {
            System.out.print(j + " ");
        }
    }

    public static int[] prefixSuffixProduct(int arr[], int n) {
        int temp[] = new int[arr.length];
        temp[0] = 1;
        int suffix = 1;
        for (int i = 1; i < arr.length; i++) {
            temp[i] = temp[i - 1] * arr[i - 1];
        }
        for (int j = arr.length - 2; j >= 0; j--) {
            suffix *= arr[j + 1];
            temp[j] *= suffix;
        }
        return temp;
    }
}
