class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> a = new ArrayList();
        generateSubSets(nums, a, 0);
        return ans;
    }

    public void generateSubSets(int[] nums, List<Integer> a, int index){
        if(index >= nums.length){
            ans.add(new ArrayList(a));
            return;
        }

        a.add(nums[index]);
        generateSubSets(nums, a, index + 1);
        a.remove(a.size()-1);
        generateSubSets(nums, a, index + 1);
        
    }


}