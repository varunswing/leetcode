class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int m = accounts[0].length;
        
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int temp = 0;
            for(int j=0; j<m; j++){
                temp += accounts[i][j];
            }
            ans = Math.max(ans, temp);
        }
        return ans;
    }
}