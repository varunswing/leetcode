import java.util.*;

class Solution {
    public int orangesRotting(int[][] grid) {
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        int countFresh = 0;
        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < m; ++i)
            for (int j = 0; j < n; ++j)
                if (grid[i][j] == 1)
                    ++countFresh;
                else if (grid[i][j] == 2)
                    q.offer(new int[] {i, j});

        if (countFresh == 0)
            return 0;

        while (!q.isEmpty()) {
            ++ans;
            int sz = q.size();
            for (int i = 0; i < sz; ++i) {
                int[] cell = q.poll();
                int x = cell[0];
                int y = cell[1];
                for (int[] dir : dirs) {
                    int nx = x + dir[0];
                    int ny = y + dir[1];
                    if (nx < 0 || nx == m || ny < 0 || ny == n)
                        continue;
                    if (grid[nx][ny] != 1)
                        continue;
                    grid[nx][ny] = 2;   // Mark grid[nx][ny] as rotten.
                    q.offer(new int[] {nx, ny});  // Push the newly rotten orange to the queue.
                    --countFresh;     // Decrease the count of fresh oranges by 1.
                }
            }
        }

        return countFresh == 0 ? ans - 1 : -1;
    }
}