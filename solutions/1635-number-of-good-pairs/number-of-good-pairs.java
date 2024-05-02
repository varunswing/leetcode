class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> mp = new HashMap();
        for(int i=0; i<nums.length; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
        }
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            if(mp.get(nums[i]) > 0){
                int n = mp.get(nums[i]);
                ans += (n*(n-1))/2;
                mp.put(nums[i], 0);
            }
        }
        return ans;
    }
}