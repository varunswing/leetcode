class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;

        boolean[][] seenP = new boolean[n][m];
        boolean[][] seenA = new boolean[n][m];

        for(int i=0; i<n; i++){
            if(!seenP[i][0]){
                dfs(heights, n, m, i, 0, seenP, 0);
            }
            if(!seenA[i][m-1]){
                dfs(heights, n, m, i, m-1, seenA, 0);
            }
        }

        for(int j=0; j<m; j++){
            if(!seenP[0][j]){
                dfs(heights, n, m, 0, j, seenP, 0);
            }
            if(!seenA[n-1][j]){
                dfs(heights, n, m, n-1, j, seenA, 0);
            }
        }

        List<List<Integer>> ans = new ArrayList();

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(seenP[i][j] && seenA[i][j]){
                    ans.add(new ArrayList(Arrays.asList(i, j)));
                }
            }
        }

        return ans;
    }

    public void dfs(int[][] heights, int n, int m, int i, int j, boolean[][] seen, int height){
        if(i < 0 || j>= m || i >= n || j < 0 || seen[i][j] || heights[i][j] < height){
            return;
        }

        seen[i][j] = true;

        if(i+1 < n && heights[i][j] <= heights[i+1][j] && !seen[i+1][j]){
            dfs(heights, n, m, i+1, j, seen, heights[i][j]);
        }
        if(j+1 < m && heights[i][j] <= heights[i][j+1] && !seen[i][j+1]){
            dfs(heights, n, m, i, j+1, seen, heights[i][j]);
        }
        if(i-1 >= 0 && heights[i][j] <= heights[i-1][j] && !seen[i-1][j]){
            dfs(heights, n, m, i-1, j, seen, heights[i][j]);
        }
        if(j-1 >=0  && heights[i][j] <= heights[i][j-1] && !seen[i][j-1]){
            dfs(heights, n, m, i, j-1, seen, heights[i][j]);
        }
    }
}