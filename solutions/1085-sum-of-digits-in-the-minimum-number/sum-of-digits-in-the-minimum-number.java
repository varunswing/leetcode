class Solution {
    public int sumOfDigits(int[] nums) {
        int mn = nums[0];
        for(int num : nums){
            mn = Math.min(num, mn);
        }

        int ans = 0;
        while(mn > 0){
            int a = mn%10;
            mn /=10;
            ans+=a;
        }

        if((ans&1) != 0){
            return 0;
        }

        return 1;
    }
}