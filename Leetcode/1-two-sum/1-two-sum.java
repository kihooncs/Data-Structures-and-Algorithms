class Solution {
    public int[] twoSum(int[] nums, int target) {
        // create a hash map <Integer, Integer> The first integer indicates value and second integer is index
        // for each element in the nums, if map has kay = target - currValue, then return int[key's value, curr index]
        // else put current element in the map.
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currValue = nums[i];
            int key = target - currValue;
            if (map.containsKey(key)) {
                return new int[]{map.get(key), i};
            }
            map.put(currValue, i);
        }
        return new int[2];
    }
}