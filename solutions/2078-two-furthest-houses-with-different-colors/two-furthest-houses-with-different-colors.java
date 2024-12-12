class Solution {
    public int maxDistance(int[] colors) {
        int i=0;
        int j=colors.length-1;
        int ans = 0;
        while(i<j){
            if(colors[i] != colors[j]){
                ans = j-i;
                break;
            }
            i++;
        }
        i=0;
        j=colors.length-1;
        while(i<j){
            if(colors[i] != colors[j]){
                ans = Math.max(j-i, ans);
                break;
            }
            j--;
        }
        return ans;
    }
}