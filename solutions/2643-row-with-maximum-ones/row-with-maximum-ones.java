class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n = mat.length;
        int[] ans = new int[2];
        for(int i=0; i<n; i++){
            int count = (int) Arrays.stream(mat[i]).filter(a -> a==1).count();
            if(count > ans[1]){
                ans[1] = count;
                ans[0] = i;
            }
        }
        return ans;
    }
}