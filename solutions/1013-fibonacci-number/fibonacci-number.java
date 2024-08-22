class Solution {
    public int fib(int n) {
        if(n<2){
            return n;
        }

        int prev = 0;
        int prev1 = 1;

        int ans = prev+prev1;

        for(int i=3; i<=n; i++){
            prev = prev1;
            prev1 = ans;
            ans = prev + prev1;
        }

        return ans;
        
    }
}