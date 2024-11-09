class Solution {
    public boolean canAliceWin(int[] nums) {
        int a = 0;
        int b = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 10){
                a+=nums[i];
            }else{
                b+=nums[i];
            }
        }
        return !(a==b);
    }
}