class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }
        
        Map<Integer, Integer> m = new HashMap();
        for(int i=0; i<n; i++){
            m.put(nums[i], m.getOrDefault(nums[i], 0)+1);
        }
        for(int i=0; i<n; i++){
            if(m.get(nums[i]) == 1){
                return nums[i];
            }
        }
        return nums[n-1];
        
    }
}