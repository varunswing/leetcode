class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder res = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                res.append(sb.reverse());
                res.append(' ');
                sb = new StringBuilder();
            }else{
                sb.append(s.charAt(i));
            }
        }
        res.append(sb.reverse());

        return res.toString();
    }
}