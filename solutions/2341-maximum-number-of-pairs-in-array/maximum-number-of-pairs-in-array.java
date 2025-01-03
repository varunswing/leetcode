class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] ans = new int[101];
        for(int i=0; i<nums.length; i++){
            ans[nums[i]]++;
        }

        int p = 0;
        int l = 0;
        for(int i=0; i<=100; i++){
            if(ans[i] != 0 && (ans[i]&1) != 0){
                l++;
                p += ans[i]/2;
            }else if(ans[i] != 0){
                p += ans[i]/2;
            }
        }

        return new int[]{p, l};
    }
}