class Solution {
    public int minLength(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<sb.length()-1; i++){
            if(sb.charAt(i) == 'A'){
                if(i+1 < sb.length() && sb.charAt(i+1) == 'B'){
                    sb.delete(i, i+2);
                    i-=2;
                    if(i<0){
                        i = -1;
                    }
                    continue;
                }
            }
            if(sb.charAt(i) == 'C'){
                if(i+1 < sb.length() && sb.charAt(i+1) == 'D'){
                    sb.delete(i, i+2);
                    i -= 2;
                    if(i<0){
                        i = -1;
                    }
                }
            }
        }
        return sb.length();
    }
}