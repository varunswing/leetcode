class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int j=0;
        int n = s.length();

        if(n==1){
            return false;
        }

        while(j < n/2){
            String a = s.substring(0, j+1);
            int m = n/(j+1);
            StringBuilder sb = new StringBuilder();
            for(int l = 0; l<m; l++){
                sb.append(a);
            }

            if(sb.toString().equals(s)){
                return true;
            }
            j++;
        }

        return false;
    }
}