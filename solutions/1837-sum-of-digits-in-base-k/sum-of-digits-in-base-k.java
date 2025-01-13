class Solution {
    public int sumBase(int n, int k) {
        int ans = 0;
        int count = 1;
        int res = 0;
        while(n > 0){
            int rem = n%k;
            n /= k;
            ans += rem*count;
            count*=10;
        }
        while(ans > 0){
            res += ans%10;
            ans/=10;
        }

        return res;
    }
}