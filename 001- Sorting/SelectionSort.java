
class Main {

    public static void main(String[] args) {
        int arr[] = {54, 25, 16, 72, 4};
        int min;
        for (int i = 0; i <= arr.length - 2; i++) {
            min = i;
            for (int j = i; j <= arr.length - 1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;

            }
        }
    }
}
