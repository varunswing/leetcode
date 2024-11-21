class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int ans = 0;
        
        for(int i = 0; i < n; ++i){
            HashSet<Integer> temp = new HashSet<>();
            
            for(int j = i; j<n; j++){
                temp.add(nums.get(j));
                ans += Math.pow(temp.size(), 2);
            }
        }
        return ans;
    }
}