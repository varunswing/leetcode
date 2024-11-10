class Solution {
    public boolean hasAlternatingBits(int n) {
        int a = Integer.bitCount(n);
        boolean flag = false;
        if((n&1) == 0) flag = true;
        if(flag){
            int i = 0;
            while((n != 0)){
                if((i&1) == 0){
                    if((n&1) != 0){
                        return false;
                    }
                    n>>=1;
                }else{
                    if((n&1) != 1){
                        return false;
                    }
                    n>>=1;
                }
                i++;
            }
        }else{
            int i = 0;
            while((n != 0)){
                if((i&1) == 0){
                    if((n&1) != 1){
                        return false;
                    }
                    n>>=1;
                }else{
                    if((n&1) != 0){
                        return false;
                    }
                    n>>=1;
                }
                i++;
            }
        }
        return true;
    }
}