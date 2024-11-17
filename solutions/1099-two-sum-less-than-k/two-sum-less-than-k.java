class Solution {
    public int twoSumLessThanK(int[] nums, int k) {
        int sum = -1;

        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            if(nums[left] + nums[right] < k){
                sum = Math.max(sum, nums[left] + nums[right]);
                left++;
            }else{
                right--;
            }
        } 
        return sum;
    }
}