class Solution {
    List<List<Integer>> result = new ArrayList();
    
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> a = new ArrayList();
        sets(nums, a, 0);
        return result;
    }
    
    public void sets(int[] nums, List<Integer> a, int i){
        if(i >= nums.length){
            result.add(new ArrayList(a));
            return;
        }
        
        a.add(nums[i]);
        sets(nums, a, i+1);
        a.remove(a.size()-1);
        sets(nums, a, i+1);
    }
}