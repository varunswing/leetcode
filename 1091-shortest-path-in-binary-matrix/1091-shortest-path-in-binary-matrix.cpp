class Solution {
public:
    int shortestPathBinaryMatrix(vector<vector<int>>& grid) {
        int n = grid.size();
        int dx[8] = {1, 0, 1, 0, -1, -1, 1, -1};
        int dy[8] = {0, 1, 1, -1, 0, -1, -1, 1};
        queue<vector<int>> q;
        vector<vector<bool>> vis(n, vector<bool>(n, false));
        if(grid[0][0] == 1 || grid[n-1][n-1] == 1){
            return -1;
        }
        if(n == 1){
            return 1;
        }
        q.push({0, 0});
        vis[0][0] = true;
        int ans = 1;
        while(q.size()){
            ans++;
            int a = q.size();
            for(int j = 0; j<a; j++){
                vector<int> v = q.front();
                q.pop();
                int x, y;
                for(int i=0; i<8; i++){
                    x = v[0] + dx[i];
                    y = v[1] + dy[i];
                
                    if(x >=0 && y>=0 && x < n && y < n && vis[x][y] == false){
                        if(x == n-1 && y == n-1) return ans;
                        if(grid[x][y] == 0) q.push({x, y});
                        vis[x][y] = true;
                    }
                }
                
            }
        }
        return -1;
    }
};