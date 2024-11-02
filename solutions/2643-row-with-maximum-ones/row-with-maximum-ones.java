class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] ans = new int[2];
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<m; j++){
                if(mat[i][j] == 1){
                    count++;
                }
            }
            if(count > ans[1]){
                ans[1] = count;
                ans[0] = i;
            }
        }
        return ans;
    }
}