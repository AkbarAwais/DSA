
public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};
        int n = arr.length;
        System.out.println(buyandSellStock(arr, n));
    }

    public static int buyandSellStock(int[] arr, int n) {
        int min = arr[0];
        int profit = 0;
        for (int i = 1; i < n; i++) {
            int cost = arr[i] - min;
            profit = Math.max(profit, cost);
            min = Math.min(min, arr[i]);
        }
        return profit;
    }
}
