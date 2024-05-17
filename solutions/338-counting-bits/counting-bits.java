class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0; i<n+1; i++){
            int a = i;
            int count = 0;
            while(a > 0){
                a = a & (a-1);
                count++;
            }
            ans[i] = count;
        }
        return ans;
    }
}