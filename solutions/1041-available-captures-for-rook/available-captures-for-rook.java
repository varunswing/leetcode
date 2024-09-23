class Solution {
    public int numRookCaptures(char[][] board) {
        int x = 0, y=0;

        int n = board.length;
        int m = board[0].length;

        boolean flag = false;

        for(int i=0; i<n; i++){
            if(flag) break;
            for(int j=0; j<m; j++){
                if(board[i][j] == 'R'){
                    x = i;
                    y = j;
                    flag = true;
                    break;
                }
            }
        }

        int ans = 0;

        for(int[] d : new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}}){
            for(int i = x + d[0], j = y + d[1]; i >= 0 && i<n && j>=0 && j<m; i+=d[0], j+=d[1]){
                if(board[i][j] == 'p'){
                    ans++;
                    break;
                }

                if(board[i][j] == 'B'){
                    break;
                }
            }
        }

        return ans;
    }
}