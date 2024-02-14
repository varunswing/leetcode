class Solution {
    public int[] rearrangeArray(int[] nums) {
        Queue<Integer> nq = new LinkedList();
        Queue<Integer> np = new LinkedList();
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i] >= 0){
                np.add(nums[i]);
            }else{
                nq.add(nums[i]);
            }
        }
        
        for(int i=0; i<nums.length; i++){
            if(i%2 == 0){
                ans[i] = np.remove();
            }else{
               ans[i] = nq.remove();
            }
        }
        return ans;
    }
}
