class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        if(amount == 0){
            return 0;
        }

        if(coins[0] > amount){
            return -1;
        }

        int[] dp = new int[amount+1];

        for(int i=0; i<=amount; i++){
            dp[i] = Integer.MAX_VALUE - 1;
        }

        for(int i=0; i<coins.length; i++){
            if(coins[i] <= amount){
                dp[coins[i]] = 1;
            }
        }

        for(int coin : coins){
            for(int i=coin; i<=amount; i++){
                dp[i] = Math.min(1 + dp[i-coin], dp[i]);
            }
        }

        if(dp[amount] == Integer.MAX_VALUE-1){
            return -1;
        }
        return dp[amount];
    }
}