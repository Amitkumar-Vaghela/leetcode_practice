class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buyPrice = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < n; i++) {
            // Update the lowest buy price so far
            buyPrice = Math.min(buyPrice, prices[i]);

            // Update the maximum profit so far
            profit = Math.max(profit, prices[i] - buyPrice);
        }

        return profit;
    }

      // Example run
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + sol.maxProfit(prices));
    }
}

// output 
// Max Profit: 5

