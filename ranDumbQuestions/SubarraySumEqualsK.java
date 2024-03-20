class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap();
        m.put(0, 1);
        int n = nums.length;
        int ans = 0;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum+=nums[i];
            if(m.get(sum - k) != null){
                ans += m.get(sum-k);
            }
            m.put(sum, m.getOrDefault(sum, 0) + 1);
        }
        
        return ans;
    }
}
