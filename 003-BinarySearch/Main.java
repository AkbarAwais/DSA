//{ Driver Code Starts

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int x = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] arr = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }

            Solution ob = new Solution();
            int[] ans = ob.getFloorAndCeil(x, arr);
            System.out.println(ans[0] + " " + ans[1]);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends
// User function Template for Java
class Solution {

    public int[] getFloorAndCeil(int x, int[] arr) {
        int floor = -1;
        int ceil = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < x) {
                floor = Math.max(floor, arr[i]);
            }
            if (arr[i] > x) {
                ceil = Math.min(ceil, arr[i]);
            }
        }
        if (ceil == arr.length) {
            return new int[]{floor, -1};
        }
        return new int[]{floor, ceil};
    }
}
