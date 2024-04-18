class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        int n = strs.length;
        int j = 0;
        int m = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            m = Math.min(m, strs[i].length());
        }
        
        
        while(m > 0){
            char c = strs[0].charAt(j);
            for(int i=1; i<n; i++){
                if(strs[i].charAt(j) != c){
                    return ans;
                }
            }
            ans += c;
            m--;
            j++;
        }
        return ans;
    }
}