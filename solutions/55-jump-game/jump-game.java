class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if(n <= 1){
            return true;
        }
        
        int i=0;
        int j = -1;
        
        if(nums[0] == 0){
            return false;
        }
        
        while(i!=j){
            j = Math.max(j, i+nums[i]);
            i=j;
            if(j >= n-1){
                return true;
            }
            for(int k=0; k<=j; k++){
                j = Math.max(j, k+nums[k]);
                if(j >= n-1){
                    return true;
                }       
            }
        }
        
        return false;
        
    }
}