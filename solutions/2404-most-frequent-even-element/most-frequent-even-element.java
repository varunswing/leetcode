class Solution {
    public int mostFrequentEven(int[] nums) {
        int ans = -1;
        int res = Integer.MAX_VALUE;
        Map<Integer, Integer> m = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if((nums[i]&1) == 0){
                m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);
                if(ans < m.get(nums[i])){
                    ans = m.get(nums[i]);
                    res = nums[i];
                }else if(ans == m.get(nums[i])){
                    res = Math.min(res, nums[i]);
                }
            }
        }
        return ans == -1 ? -1 : res;
    }
}