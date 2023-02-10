class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<Integer>();
        for (int n : nums) {
            if (numbers.contains(n)) {
                return true;
            }
            numbers.add(n);
        }
        return false;
    }
}