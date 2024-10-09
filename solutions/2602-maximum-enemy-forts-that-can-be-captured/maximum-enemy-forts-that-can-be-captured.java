class Solution {
    public int captureForts(int[] forts) {
        int flag = 0;
        int ans = 0;
        int count = 0;
        for(int i=0; i<forts.length; i++){
            if(forts[i] != 0 && flag == 0){
                flag = -1*forts[i];
            }
            if(forts[i] != 0 && forts[i] == flag){
                flag = -1*flag;
                ans = Math.max(ans, count);
                count = 0;
            }
            if(forts[i] != 0 && forts[i] != flag){
                count = 0;
            }
            if(forts[i] == 0 && flag != 0){
                count++;
            }
        }
        return ans;
    }
}