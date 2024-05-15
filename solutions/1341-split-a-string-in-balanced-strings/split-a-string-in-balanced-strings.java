class Solution {
    public int balancedStringSplit(String s) {
        int ans = 0;
        int res = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'L'){
                res++;
            }else{
                res--;
            }
            if(res == 0){
                ans++;
            }
        }
        
        return ans;
    }
}