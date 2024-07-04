class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            ans[i] = 1;
        }
        int i = 1, j = 0;
        while(i < n){
            while(j < i){
                if(nums[j] < nums[i]){
                    ans[i] = Math.max(ans[i], 1 + ans[j]);
                }
                // ans[i] = Math.max(ans[i], ans[j]); 
                j++;
            }
            j = 0;
            i++;
        }
        
        Arrays.sort(ans);
        
        return ans[n-1];
    }
}