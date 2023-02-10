class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxAmount = 0
        l, r = 0, len(height) - 1
        while l < r:
            currAmount = min(height[l], height[r]) * (r - l)
            maxAmount = max(maxAmount, currAmount)
            if height[l] > height[r]:
                r -= 1
            elif height[l] < height[r]:
                l += 1
            else:
                # height[l] == height[r]
                l += 1
        return maxAmount

        # time complexity: O(n) where n is length height list since at the worst case, we traverse
        # the given list at most once.

        # Space complexity: O(1)