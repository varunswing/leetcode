class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }

        if(n==2){
            return Math.max(nums[0], nums[1]);
        }

        int temp = nums[0];

        for(int i=2; i<nums.length; i++){
            if(nums[i-2] > temp){
                temp = nums[i-2];
            }
            nums[i] = nums[i] + temp;
        }

        return Math.max(nums[nums.length-1], nums[nums.length-2]);
    }
}