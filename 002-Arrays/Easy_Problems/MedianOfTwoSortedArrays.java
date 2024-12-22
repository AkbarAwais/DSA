
import java.util.ArrayList;
import java.util.List;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        int arr1[] = {1, 3}; //1 3     2 
        int arr2[] = {2, 4,5};
        List temp = merge(arr1, arr2);
        int size = temp.size();
        if (size % 2 == 1) {
            // For odd-sized list
        } else {
            // For even-sized list
            int midIndex1 = size / 2 - 1;
            int midIndex2 = size / 2;
            double median = (((Integer) temp.get(midIndex1)).doubleValue() + ((Integer) temp.get(midIndex2)).doubleValue()) / 2.0;
            System.out.println("Median: " + median);
        }


    }

    public static List merge(int[] arr1, int[] arr2) {
        int lowleftarr = 0, lowrightarr = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (lowleftarr < arr1.length && lowrightarr < arr2.length) {
            if (arr1[lowleftarr] < arr2[lowrightarr]) {
                arrayList.add(arr1[lowleftarr]);
                lowleftarr++;
            } else {
                arrayList.add(arr2[lowrightarr]);
                lowrightarr++;
            }
        }
        while (lowleftarr < arr1.length) {
            arrayList.add(arr1[lowleftarr]);
            lowleftarr++;
        }
        while (lowrightarr < arr2.length) {
            arrayList.add(arr2[lowrightarr]);
            lowrightarr++;
        }
        return new ArrayList<>(arrayList);
    }
}
