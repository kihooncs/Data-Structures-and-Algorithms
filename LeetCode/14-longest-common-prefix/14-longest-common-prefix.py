class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        result = ""
        firstStr = strs[0]
        for i, c in enumerate(firstStr):
            for val in strs:
                if i == len(val) or c != val[i]:
                    return result
            result += c
        return result
        # O(minLengthStrAmong(strs) * n)