class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n =  nums.length;

        double ans = Integer.MAX_VALUE;

        for(int i=0; i<n/2; i++){
            ans = Math.min((double)(nums[i] + nums[n-1-i])/2, ans);
        }

        return ans;
    }
}