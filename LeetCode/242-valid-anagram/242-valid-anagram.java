class Solution {
    public boolean isAnagram(String s, String t) {
        // create int[] 
        // For each string in s, increment value int[]
        // for each string in t, decrement value int[]
        // check all values in int[] is 0
        int[] arr = new int[26];
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char curr1 = s.charAt(i);
            char curr2 = t.charAt(i);
            arr[curr1 - 'a']++;
            arr[curr2 - 'a']--;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}