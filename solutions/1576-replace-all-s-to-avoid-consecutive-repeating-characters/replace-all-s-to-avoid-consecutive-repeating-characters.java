class Solution {
    public String modifyString(String s) {
        StringBuilder sb = new StringBuilder(s);
        int n = s.length();
        for(int i=0; i<s.length(); i++){
            int flag = 0;
            if(sb.charAt(i) == '?'){
                sb.replace(i, i+1, "a");
            }
            if(i>0){
                if(sb.charAt(i-1) == sb.charAt(i)){
                    sb.replace(i, i+1, "b");
                    flag = 1;
                }
            }
            if(flag == 0){
                if(i < n-1){
                    if(sb.charAt(i+1) == sb.charAt(i)){
                        sb.replace(i, i+1, "b");
                        if(i>0){
                            if(sb.charAt(i-1) == sb.charAt(i)){
                                sb.replace(i, i+1, "c");
                                flag = 1;
                            }
                        }
                    }
                }
            }else{
                if(i < n-1){
                    if(sb.charAt(i+1) == sb.charAt(i)){
                        sb.replace(i, i+1, "c");
                        flag = 1;
                    }
                }
            }
        }
        return sb.toString();
    }
}