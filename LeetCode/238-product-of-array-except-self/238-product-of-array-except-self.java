class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        int product = nums[0];
        for (int i = 1; i < result.length; i++) {
            result[i] = product;
            product = product * nums[i];
        }
        product = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            result[i] = result[i] * product;
            product = product * nums[i];
        }
        return result;
    }
}