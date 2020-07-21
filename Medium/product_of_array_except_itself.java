class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] left = new int[length];
        int[] right = new int[length];
        int[] ans = new int[length];
        left[0] = 1;
        right[length-1] = 1;
        for (int i = 1; i < length; i++) {
            left[i] = nums[i-1] * left[i-1];
        }
        for (int j = length-2; j >= 0; j--) {
            right[j] = nums[j+1] * right[j+1];
        }
        for (int n = 0; n < length; n++) {
            ans[n] = left[n] * right[n];
        }
        return ans;
    }
}
