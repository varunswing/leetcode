class Solution {
    public int search(int[] nums, int target) {
        return bs(0, nums.length-1, nums, target);
    }
    
    public int bs(int l, int r, int[] nums, int k){
        int m = l + (r-l)/2;
        if(l>r){
            return -1;
        }
        
        if(nums[m] == k){
            return m;
        }

        if(l==m && r==m){
            return -1;
        }

        if(nums[m] > k){
            r = m-1;
        }else{
            l = m+1;
        }
        
        return bs(l, r, nums, k);
    }
}