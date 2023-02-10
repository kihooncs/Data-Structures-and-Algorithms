class Solution {
    public int coinChange(int[] coins, int amount) {
        // OPT(Amount) = Minimum number of coins that make exactly Amount.
        // If OPT(Amount) does not select a coin c
        // -> Then, OPT(Amount) = OPT(Amount). 
        // If OPT(Amount) does select a coin c
        // -> Then, OPT(Amount) = OPT(Amount - value of coin)
        int min = 0;
        int[] dp = new int[amount + 1];
        for (int i = 0; i < dp.length; i++) {
            if (i > 0) {
                dp[i] = Integer.MAX_VALUE;
            }
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i && dp[i - coins[j]] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
                }
            }
        }
        if (dp[amount] == Integer.MAX_VALUE) {
            return -1;
        }
        return dp[amount];
    }
}