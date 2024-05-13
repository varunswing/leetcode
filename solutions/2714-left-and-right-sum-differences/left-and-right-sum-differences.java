class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] sum = new int[n];
        sum[0] = nums[0];
        for(int i=1; i<n; i++){
            sum[i] = nums[i] + sum[i-1];
        }
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            if(i > 0){
                ans[i] = Math.abs((sum[n-1] - sum[i-1]) - sum[i]);
            }else{
                ans[i] = Math.abs(sum[n-1] - sum[i]);
            }
        }
        return ans;
    }
}