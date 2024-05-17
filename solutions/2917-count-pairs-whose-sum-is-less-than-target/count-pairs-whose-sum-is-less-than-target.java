class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int ans = 0;
        for(int j=0; j<nums.size(); j++){
            for(int i=j+1; i<nums.size(); i++){
                if(nums.get(i)  + nums.get(j) >= target){
                    break;
                }
                ans++;
            }
        }
        return ans;
    }
}