class Solution {
    public int differenceOfSum(int[] nums) {
        long sum = 0;

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }

        long dsum = 0;

        for(int i=0; i<nums.length; i++){
            int a = 0;
            if(nums[i] > 9){
                while(nums[i] > 9){
                    a += nums[i]%10;
                    nums[i] /= 10;
                }
            }
            dsum += nums[i] + a;
        }

        return Math.abs((int)dsum-(int)sum);
        
    }
}