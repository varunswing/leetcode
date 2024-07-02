class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        int s = nums.length;
        List<List<Integer>> ans = new ArrayList();
        
        
        for(int i=0; i+2 < s; i++){
            if (i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int k = i+1;
            int j = s-1;
            while(k < j){
                if(nums[i] + nums[k] + nums[j] == 0){
                    List<Integer> temp = new ArrayList();
                    temp.add(nums[i]);
                    temp.add(nums[k++]);
                    temp.add(nums[j--]);
                    ans.add(new ArrayList(temp));
                    while(k < j && nums[k] == nums[k-1]){
                        k++;
                    }
                    while(k < j && nums[j] == nums[j+1]){
                        j--;
                    }
                }else if(nums[i] + nums[k] + nums[j] > 0){
                    j--;
                }else{
                    k++;
                }
            }
        }
        
        
        return ans;
        
    }
}