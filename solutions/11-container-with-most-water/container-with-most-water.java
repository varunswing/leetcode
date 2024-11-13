class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;

        int area = 0;

        while(l < r){
            area = Math.max(area, Math.min(height[l], height[r])* (r - l));

            if(height[r] < height[l]){
                r--;
            }else{
                l++;
            }
        }
        return area;
    }
}