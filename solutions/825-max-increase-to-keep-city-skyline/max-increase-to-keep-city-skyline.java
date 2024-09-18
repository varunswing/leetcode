class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {

        int ans = 0;
        int n = grid.length;

        int[] mn = new int[n];
        int[] mm = new int[n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mn[i] = Math.max(mn[i], grid[i][j]);
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mm[i] = Math.max(mm[i], grid[j][i]);
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                ans +=  Math.min(mm[j], mn[i]) - grid[i][j];
            }
        }
        
        return ans;
    }
}