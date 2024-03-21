class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<prices.length-1; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            if(prices[i+1] > min){
                ans = Math.max(prices[i+1] - min, ans);
            }
        }
        return ans;
    }
}
