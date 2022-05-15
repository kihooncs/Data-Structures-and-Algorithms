class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int currSum = Math.max(0, nums[0]);
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            currSum = currSum + curr;
            max = Math.max(max, currSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return max;
    }
}