class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> num = new ArrayList();
        sets(0, nums, num, new ArrayList());
        return num;
    }
    
    public void sets(int j, int[] nums, List<List<Integer>> num, List<Integer> ans){
        
        num.add(new ArrayList(ans));
        for(int i=j; i<nums.length; i++){
            ans.add(nums[i]);
            System.out.println(ans);
            sets(i+1, nums, num, ans);
            ans.remove(ans.size() - 1);
        }
    }
}