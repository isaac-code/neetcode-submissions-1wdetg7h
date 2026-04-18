class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int left = 0;
        int right = prices.length - 1;

        while (left < right) {
            int pointer = right;
            while (left < pointer) {
                int profit = prices[pointer] - prices[left];
                maxProfit = Math.max(profit, maxProfit);
                pointer--;
            }
            left++;
        }
        return maxProfit;
    }
}
