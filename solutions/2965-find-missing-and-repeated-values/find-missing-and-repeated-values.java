class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] arr = new int[n*n];
        int[] ans = new int[2];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[grid[i][j]-1]++;
                if(arr[grid[i][j]-1] > 1){
                    ans[0] = grid[i][j];
                }
            }
        }

        for(int i=0; i<n*n; i++){
            if(arr[i] == 0){
                ans[1] = i+1;
                return ans;
            }
        }
        return ans;
    }
}