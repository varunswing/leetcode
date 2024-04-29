class Solution {
    public int minOperations(int[] nums, int k) {
        int xor = nums[0];
        for(int i=1; i<nums.length; i++){
            xor ^= nums[i];
        }
        
        int ans = xor^k;
        int count = 0;
        while(ans > 0){
            count += ans&1;
            ans >>= 1;
        }
        return count;
    }
}