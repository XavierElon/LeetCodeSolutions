class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        
        int min = prices[0];
        int max_profit = 0;
        
        for (int price: prices) {
            min = Math.min(min, price);
            max_profit = Math.max(max_profit, price - min);
        }
        return max_profit;
    }
}
