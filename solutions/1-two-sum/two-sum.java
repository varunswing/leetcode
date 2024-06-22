class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer, Integer> m = new HashMap();
        for(int i=0; i<nums.length; i++){
            if(m.containsKey(target - nums[i])){
                ans[0] = i;
                ans[1] = m.get(target - nums[i]);
                return ans;
            }
            m.put(nums[i], i);
        }
        return ans;
    }
}