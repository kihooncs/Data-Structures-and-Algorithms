class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minVal = prices[0]
        profit = 0
        for val in prices:
            minVal = min(minVal, val)
            profit = max(profit, val - minVal)
        return profit
# Time complexity: O(n)
# Brute Force: double nested loop : O(n^2)