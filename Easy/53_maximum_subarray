class Solution {
    public int maxSubArray(int[] nums) {
        int current_sum = Integer.MIN_VALUE;
        int max_sum = Integer.MIN_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            if (current_sum <= 0 && nums[i] > current_sum) {
                current_sum = nums[i];
            } else {
                current_sum += nums[i];
            }
            if (current_sum > max_sum) max_sum = current_sum;
        }
        return max_sum;
    }
}
