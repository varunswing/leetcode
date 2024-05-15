class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] ans = new int[n-2][m-2];
        for(int i=0; i<n-2; i++){
            for(int j=0; j<m-2; j++){
                ans[i][j] = getMax(i, j, grid);
            }
        }
        return ans;
    }
    
    
    public int getMax(int i, int j, int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        int mx = Integer.MIN_VALUE;
        for(int x=i; x<i+3; x++){
            for(int y=j; y<j+3; y++){
                mx = Math.max(mx, grid[x][y]);
            }
        }
        return mx;
    }
}