class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i=0; i<n; i++){
            ans |= nums[i];
        }
        
        return ans << n-1;
    }
}