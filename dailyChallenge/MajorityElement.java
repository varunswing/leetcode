class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int count = 1;
        for(int i=0; i<n-1; i++){
            if(count > n/2){
                return nums[i];
            }
            if(nums[i] == nums[i+1]){
                count++;
            }else{
                count = 1;
            }
        }
        return nums[n-1];
        
    }
}
