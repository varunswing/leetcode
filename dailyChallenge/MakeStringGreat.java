class Solution {
    public String makeGood(String s) {
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) != s.charAt(i+1) && Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(i+1))){
                return makeGood(s.substring(0, i) + s.substring(i+2));
            }
        }
        return s;
    }
}
