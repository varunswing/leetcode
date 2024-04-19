class Solution {
    public int numIslands(char[][] grid) {
        Queue<int[]> q = new LinkedList();
        int n = grid.length;
        int m = grid[0].length;
        int ans = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j]=='1'){
                    grid[i][j] = '0';
                    ans++;
                    q.offer(new int[]{i, j});
                    while(q.size()>0){
                        int[] arr = q.poll();
                        int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
                        for(int[] dx: dir){
                            int newRow = arr[0] + dx[0];
                            int newCol = arr[1] + dx[1];
                            if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && grid[newRow][newCol] == '1') {
                                q.offer(new int[]{newRow, newCol}); 
                                grid[newRow][newCol] = '0';
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }
}