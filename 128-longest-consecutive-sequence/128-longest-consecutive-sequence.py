class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        numSet = set(nums)
        maxVal = 0
        for val in nums:
            if (val - 1) in numSet:
                continue
            else:
                # val is the beginning of the sequence
                curr = 1
                while (val + 1) in numSet:
                    curr += 1
                    val += 1
                maxVal = max(curr, maxVal)
        return maxVal 