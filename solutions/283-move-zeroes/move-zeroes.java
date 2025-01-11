class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;

        int i=0;
        int j=0;

        while(i < n){
            if(nums[i] == 0){
                i++;
            }else{
                nums[j] = nums[i];
                if(i!=j){
                    nums[i] = 0;
                }
                i++;
                j++;
            }
        }

    }
}