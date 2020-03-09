class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // [-4, -1, -1, 0, 1, 2]
        Arrays.sort(nums);
        Set<List<Integer>> threeSet = new HashSet<>();
        
        for (int i = 0; i < nums.length-2; i++) {
            int next = i+1;
            int high = nums.length-1;
            
            while(next < high) {
                int sum = nums[i] + nums[next] + nums[high];
                
                if (sum == 0) {
                    threeSet.add(Arrays.asList(nums[i], nums[next], nums[high]));
                    next++;
                    high--;
                } else if (sum < 0) {
                    next++;
                } else if (sum > 0) {
                    high--;
                }
                
            }
        }
        return new ArrayList<>(threeSet);
    }
}
