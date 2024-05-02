class Solution {
    public int[] shuffle(int[] nums, int n) {
        int s = nums.length;
        int[] a = new int[s];
        int j = 0;
        
        for(int i=0; i<s; i++){
            if(i%2 == 0){
                a[i] = nums[j];
                j++;
            }else{
                a[i] = nums[n+i/2];
            }
        }
        return a;
    }
}