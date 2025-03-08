class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();

        int[] bc = new int[n];
        int[] wc = new int[n];
        int w = 0;
        int b = 0;

        for(int i=0; i<n; i++){
            if(blocks.charAt(i) == 'W'){
                w++;
            }else{
                b++;
            }
            wc[i] = w;
            bc[i] = b;
        }

        int ans = k;

        for(int i=k-1; i<n; i++){
            int t;
            if(i < k){
                t = k - bc[i];
            }else{
                t = k - bc[i] + bc[i-k];
            }
            ans = Math.min(ans, t);
        }

        if(n == k){
            return wc[n-1];
        }

        return ans;
    }
}