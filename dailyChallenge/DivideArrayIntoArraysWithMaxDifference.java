class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int a = n/3;
        int[][] ans = new int[a][3];
        if(nums[1] - nums[0] > k || nums[2] - nums[0] > k){
            return new int[0][0];
        }
        for(int i=0; i<n-2; i+=3){
            if(nums[i+2] - nums[i+1] > k || nums[i+1] - nums[i] > k || nums[i+2] - nums[i] > k){
                return new int[0][0];
            }   
        }
        int l = 0;
        for(int i=0; i<a; i++){
            for(int j=0; j<3; j++){
                ans[i][j] = nums[l];
                l++;
            }
        }
        return ans;
    }
}
