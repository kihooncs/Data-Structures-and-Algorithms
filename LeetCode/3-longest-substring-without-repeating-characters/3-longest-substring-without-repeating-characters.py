class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        hashSet = set()
        left = 0
        result = 0
        for val in s:
            while val in hashSet:
                result = max(result, len(hashSet))
                hashSet.remove(s[left])
                left += 1
            hashSet.add(val)
        return max(result, len(hashSet))