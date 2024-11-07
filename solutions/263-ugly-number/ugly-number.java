class Solution {
    public boolean isUgly(int n) {
        if(n==0){
            return false;
        }
        

        for(int a : new int[]{2, 3, 5}){
            while(n%a == 0){
                n /= a;
            }
        }

        return n == 1;
    }
}