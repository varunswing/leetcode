class Solution {
    Set<List<Integer>> ans = new HashSet();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> a = new ArrayList();
        Arrays.sort(nums);
        generateSubString(nums, a, 0);
        return new ArrayList<>(ans);
    }

    public void generateSubString(int[] nums, List<Integer> a, int i){
        if(i >= nums.length){
            ans.add(new ArrayList<>(a));
            return;
        }

        a.add(nums[i]);
        generateSubString(nums, a, i+1);
        a.remove(a.size() - 1);
        generateSubString(nums, a, i+1);

    }
}