class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int ans = 0;
            
        while(l < r){
            int temp = Math.min(height[l], height[r]);
            ans = Math.max(ans, temp*(r-l));
            if(height[l] > height[r]){
                r--;
            }else{
                l++;
            }
        }
        return ans;
    }
}