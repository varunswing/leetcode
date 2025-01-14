class Solution {
    public int knightDialer(int n) {
        int res = 0;

        int[][] dp = new int[4][3];

        int kMod = 1_000_000_007;

        Arrays.stream(dp).forEach(A -> Arrays.fill(A, 1));
        dp[3][0] = dp[3][2] = 0;

        int[][] dirs = {{2, 1}, {-2, 1}, {2, -1}, {-2, -1}, {1, 2}, {-1, 2}, {1, -2}, {-1, -2}};

        for(int k=n; k>1; k--){
            int[][] newDp = new int[4][3];
            for(int i=0; i<4; i++){
                for(int j=0; j<3; j++){
                    if(isNotNum(i, j)){
                        continue;
                    }
                    for (int[] dir : dirs) {
                        final int x = i + dir[0];
                        final int y = j + dir[1];
                        if (x < 0 || x >= 4 || y < 0 || y >= 3)
                            continue;
                        if (isNotNum(x, y))
                            continue;
                        newDp[i][j] = (newDp[i][j] + dp[x][y]) % kMod;
                    }
                }
            }
            dp = newDp;
        }
        
        for(int[] d : dp){
            for(int a : d){
                res = (res + a) % kMod;
            }
        }

        return res;
    }

    public boolean isNotNum(int i, int j){
        return i == 3 && (j == 0 || j == 2);
    }
}