class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0];
        int dpMax = nums[0];
        int dpMin = nums[0];
        
        for(int i=1; i<nums.length; i++){
            int num = nums[i];
            int pMax = dpMax;
            int pMin = dpMin;
            if(nums[i] < 0){
                dpMin = Math.min(num, num*pMax); 
                dpMax = Math.max(num, num*pMin);
            }else{
                dpMin = Math.min(num, num*pMin); 
                dpMax = Math.max(num, num*pMax);
            }
            ans = Math.max(ans, dpMax);
        }

        return ans;
    }
}