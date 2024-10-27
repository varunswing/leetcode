class Solution {
    public int heightChecker(int[] heights) {
        int[] temp = Arrays.copyOf(heights, heights.length);
        Arrays.sort(temp);
        int ans = 0;
        for(int i=0; i<heights.length; i++){
            if(temp[i] != heights[i]){
                ans++;
            }
        }
        return ans;
    }
}