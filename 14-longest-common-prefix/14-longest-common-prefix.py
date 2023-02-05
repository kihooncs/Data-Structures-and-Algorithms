class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        result = ""
        for i in range(len(strs[0])):
            for s in strs:
                if i == len(s) or strs[0][i] != s[i]:
                    return result
            result += strs[0][i]
        return result

        # Time complexity: O(len(min(strs)*n))
        # Space complexity: O(1)
    def __init__(self):
      print("answer 1: " + self.longestCommonPrefix(["flower","flow","flight"]))
      print("answer 2: " +self.longestCommonPrefix(["dog","racecar","car"]))
      print("answer 3: " +self.longestCommonPrefix(["dograce","dogracecar","dogracecare"]))

obj = Solution();