class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp1 = new int[n-1];
        int[] dp2 = new int[n-1];
        if(n==1){
            return nums[0];
        }
        dp1[0] = nums[0];
        if(n==2){
            return Math.max(nums[0], nums[1]);
        }
        dp1[1] = Math.max(nums[0], nums[1]);
        dp2[0] = nums[1];
        if(n==3){
            return Math.max(nums[0], Math.max(nums[1], nums[2]));
        }
        int prev1 = nums[0];
        dp1[2] = Math.max(nums[1], prev1 + nums[2]);
        dp2[1] = Math.max(nums[1], nums[2]);
        prev1 = Math.max(nums[0], nums[1]);

        for(int i=4; i<n; i++){
            dp1[i-1] = prev1 + nums[i-1];
            prev1 = Math.max(dp1[i-2], prev1);
        }

        int prev2 = nums[1];

        for(int i=4; i<=n; i++){
            dp2[i-2] = prev2 + nums[i-1];
            prev2 = Math.max(dp2[i-3], prev2);
        }

        return Math.max(Math.max(dp2[n-3], dp1[n-3]), Math.max(dp2[n-2], dp1[n-2]));
        
    }
}