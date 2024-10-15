class Solution {
    public int findPeakElement(int[] nums) {
        int i=0;
        int n = nums.length;
        int j = n - 1;

        if(n==1){
            return 0;
        }

        int ans = 0;

        while(i <= j){
            if(i==0){
                if(nums[i] > nums[i+1]){
                    ans = i;
                    break;
                }
                if(nums[j] > nums[j-1]){
                    ans = j;
                    break;
                }
            }else{
                if(nums[i] > nums[i+1] && nums[i] > nums[i-1]){
                    ans = i;
                    break;
                }
                if(nums[j] > nums[j+1] && nums[j] > nums[j-1]){
                    ans = j;
                    break;
                }
            }
            i++;
            j--;
        
        }

        return ans;
        
    }
}