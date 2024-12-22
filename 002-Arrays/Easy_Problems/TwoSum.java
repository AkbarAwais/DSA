
import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        twoSum(new int[]{3, 2, 4}, 6);
    }

    public static int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums[left] + nums[right] == target) {
                return new int[]{left, right};
            } else if (nums[left] + nums[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{-1, -1};
    }
}
