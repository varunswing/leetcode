class Solution {
    public boolean canJump(int[] nums) {
        int i=0;
        int n = nums.length;
        
        for(int reach = 0; i < n && i<=reach; i++){
            reach = Math.max(reach, i+nums[i]);
        }
        
        return i == n;
        
    }
}