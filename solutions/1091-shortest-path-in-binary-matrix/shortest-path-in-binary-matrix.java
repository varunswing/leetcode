class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] == 0 && n == 1)
            return 1;
        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1)
            return -1;

        boolean[][] seen = new boolean[n][n];
        seen[0][0] = true;

        int[][] dirs = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};

        Queue<Pair<Integer, Integer>> q = new LinkedList<>();
        q.offer(new Pair(0, 0));

        for(int i=1; q.size()>0; i++){
            for(int j=q.size()-1; j>=0; j--){
                int xi = q.peek().getKey();
                int yi = q.poll().getValue();
                for (int[] dir : dirs) {
                    final int x = xi + dir[0];
                    final int y = yi + dir[1];
                    if (x < 0 || x == n || y < 0 || y == n)
                        continue;
                    if (grid[x][y] != 0 || seen[x][y])
                        continue;
                    if (x == n - 1 && y == n - 1)
                        return i + 1;
                    q.offer(new Pair<>(x, y));
                    seen[x][y] = true;
                }
            }
        }

        return -1;
    }
}