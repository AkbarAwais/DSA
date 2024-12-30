
import java.util.ArrayList;

public class UnionArrays {

    public static void main(String[] args) {
        int a[] = {-7, 8};
        int b[] = {-8, -3, 8};
        System.out.println(findUnion(a, b));
    }

    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> arr = new ArrayList<>();
        int leftLow = 0;
        int rightLow = 0;
        if (a[0] < b[0]) {
            arr.add(a[0]);
            leftLow++;
        } else {
            arr.add(b[0]);
            rightLow++;
        }

        while (leftLow < a.length && rightLow < b.length) {
            if (a[leftLow] < b[rightLow]) {
                if (arr.getLast() != a[leftLow]) {
                    arr.add(a[leftLow++]);
                } else {
                    leftLow++;
                }
            } else {
                if (arr.getLast() != b[rightLow]) {
                    arr.add(b[rightLow++]);
                } else {
                    rightLow++;
                }
            }
        }

        while (leftLow < a.length) {
            if (arr.getLast() != a[leftLow]) {
                arr.add(a[leftLow++]);
            } else {
                leftLow++;
            }
        }

        while (rightLow < b.length) {
            if (arr.getLast() != b[rightLow]) {
                arr.add(b[rightLow++]);
            } else {
                rightLow++;
            }
        }

        return arr;
    }
}
