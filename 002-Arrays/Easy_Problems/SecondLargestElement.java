
public class SecondLargestElement {

    public static void main(String[] args) {
        int arr[] = {10, 5, 10};
        int secondLargest = findSecondLargestOptimal(arr);
        System.out.println(secondLargest);
    }

    //Better solution
    // TC - O(2N)
    public static int findSecondLargest(int arr[]) {
        if (arr.length == 1) {
            return -1;
        }
        int largest = arr[0];
        int secondLargest = -1;
        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (largest != arr[i] && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        if (largest == secondLargest) {
            return -1;
        }
        return secondLargest;
    }

    //Optimal solution
    // TC - O(N)
    public static int findSecondLargestOptimal(int arr[]) {
        if (arr.length == 1) {
            return -1;
        }
        int largest = arr[0];
        int secondLargest = -1;
        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i]) {
                secondLargest = largest;
                largest = arr[i];
            } else if (largest != arr[i] && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        if (largest == secondLargest) {
            return -1;
        }
        return secondLargest;
    }
}
