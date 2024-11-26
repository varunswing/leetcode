class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int n = s.length();
        if(n == 0){
            return 0;
        }

        int c0 = 0;
        int c1 = 0;
        int ans = 0;

        for(int i=0; i<n; i++){
            if(s.charAt(i) == '0' && c1 == 0){
                c0++;
            }else if(s.charAt(i) == '0' && c1 != 0){
                c1 = 0;
                c0 = 1;
            }else if(s.charAt(i) == '1' && c0 != 0){
                c1++;
                if(c1 <= c0){
                    ans = Math.max(ans, c1*2);
                }else if(c1 > c0){
                    c1 = 0;
                    c0 = 0;
                }
            }
        }

        return ans;
    }
}