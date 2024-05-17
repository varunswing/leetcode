class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ans = 0;
        for(int i=0; i<nums.size(); i++){
            int a = i;
            int count = 0;
            while (a > 0) {
                a = a & (a - 1);
                count++;
            }
            if(count == k){
                ans += nums.get(i);
            }
        }
        return ans;
    }
}