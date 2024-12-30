
class OrderAgnosticSearch {

    public static void main(String[] args) {
        int arr1[] = {1,1,2};
        int arr2[] = {2,1,1};
        int target = 2;
        System.out.println("Ascending Search =>  " + agnosticSearch(arr1, target));
        System.out.println("Descending Search => " + agnosticSearch(arr2, target));
    }

    public static int agnosticSearch(int arr[], int target) {
        boolean isAscending = arr[arr.length - 1] > arr[0];
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                if (isAscending) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (isAscending) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
