class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n < 2) {
            return 0;
        }

        // //贪心算法
        // int res = 0;
        // for (int i=1; i<n; i++) {
        //     res += Math.max(prices[i]-prices[i-1], 0);
        // }
        // return res;

        // // 动态规划，时间复杂度 n，空间复杂度 n
        // int [][] dp = new int [n][2];
        // dp[0][0] = 0;
        // dp[0][1] = -prices[0];

        // for (int i=1; i<n; i++) {
        //     dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]+prices[i]);
        //     dp[i][1] = Math.max(dp[i-1][0]-prices[i], dp[i-1][1]);
        // }
        // return dp[n-1][0];

        // 动态规划，时间复杂度 n，空间复杂度 1
        int cash = 0;
        int hold = 0; //赋初值，值无所谓
        int precash = 0;
        int prehold = -prices[0];
        for (int i=1; i<n; i++) {
            cash = Math.max(precash, prehold+prices[i]);
            hold = Math.max(precash-prices[i], prehold);
            precash = cash;
            prehold = hold;
        }
        return cash;
    }
}
