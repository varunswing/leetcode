class Solution {
    int divisor(int n){
        int div = 1;
        for (int i=1;i<=Math.sqrt(n);i++) {
            if (n%i==0) {
                div = Math.max(div, i);
                if (n/i<n) div = Math.max(div, n / i);
            }
        }
        return div;
    }
    public int minOperations(int[] nums) {
        int ans=0; int n = nums.length;
        for(int i=n-2;i>=0;i--){
            while (nums[i]>nums[i+1]) {
                int gpd = divisor(nums[i]);
                if (gpd==1 && nums[i] != 1) {
                    return -1;
                }
                ans++;
                nums[i] /= gpd;
            }
        }
        return ans;
    }
}