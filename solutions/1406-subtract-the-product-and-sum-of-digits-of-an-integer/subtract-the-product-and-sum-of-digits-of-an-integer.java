class Solution {
    public int subtractProductAndSum(int n) {
        int p = 1;
        int s = 0;
        while(n >= 10){
            int a = n%10;
            p*=a;
            s+=a;
            n/=10;
        }
        p*=n;
        s+=n;
        return p - s;
    }
}