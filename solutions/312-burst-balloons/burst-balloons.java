class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        
        int[][] dp = new int[n][n];
        
        for(int len = 1; len <= n; len++){
            for(int i=0; i<=n-len; i++){
                int k = i+len-1;
                for(int j=i; j<=k; j++){
                    int ls = 0;
                    int rs = 0;
                    if(j!=i){
                        ls = dp[i][j-1];
                    }
                    if(j!=k){
                        rs = dp[j+1][k];
                    }
                    
                    int le = 1;
                    if(i!=0){
                        le = nums[i-1];
                    }
                    int re = 1;
                    if(k!=n-1){
                        re = nums[k+1];
                    }
                    
                    dp[i][k] = Math.max(ls + rs + le*re*nums[j], dp[i][k]);
                    
                }
            }
        }
        
        return dp[0][n-1];
    }
}