class Solution {
    public long largestPerimeter(int[] nums) {
        Long sums = 0l;
        int n = nums.length;
        for(int i=0; i<nums.length; i++){
            sums += nums[i];
        }
        
        int ans = 0;
        Arrays.sort(nums);
        for(int i=n-1; i>=0; i--){
            if(sums - nums[i] <= nums[i]){
                sums -= nums[i];
            }else{
                if(i > 1){
                    return sums;
                }else{
                    return -1;
                }
            }
        }
        return -1;
    }
}
