class Solution {
    public int[] largestSubarray(int[] nums, int k) {
        int idx = 0;
        for(int i=0; i<nums.length-k; i++){
            if(nums[i+1] > nums[idx]){
                idx = i+1;
            }
        }

        return Arrays.copyOfRange(nums, idx, idx+k);
    }
}