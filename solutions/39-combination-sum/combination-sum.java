class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList();
        List<Integer> curr = new ArrayList();
        dfs(0, candidates, target, ans, curr);
        return ans;
        
    }
    
    public void dfs(int i, int[] candidates , int target, List<List<Integer>> ans, List<Integer>  curr){
        if(target < 0){
            return;
        }
        if(0 == target){
            ans.add(new ArrayList(curr));
        }
        for(int j = i; j<candidates.length; j++){
            curr.add(candidates[j]);
            dfs(j, candidates, target-candidates[j], ans, curr);
            curr.remove(curr.size()-1);
        }
    }
}