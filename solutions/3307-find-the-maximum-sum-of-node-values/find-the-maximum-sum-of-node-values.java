class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        int m = Integer.MAX_VALUE;
        long sum = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            int a = nums[i]^k;
            if(a > nums[i]){
                sum += a;
                count++;
            }else{
                sum += nums[i];
            }
            m = Math.min(m, Math.abs(nums[i] - a));
        }
        if( (count&1) != 0){
            return sum - m;
        }
        return sum;
    }
}