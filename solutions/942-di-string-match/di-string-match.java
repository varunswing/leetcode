class Solution {
    public int[] diStringMatch(String s) {
        int l = s.length();
        int d = l;
        int n = 0;
        
        int[] ans = new int[l+1];
        for(int i=0; i<l; i++){
            if(s.charAt(i) == 'I'){
                ans[i] = n;
                n++;
            }else{
                ans[i] = d;
                d--;
            }
        }

        ans[l] = n;

        return ans;
    }
}