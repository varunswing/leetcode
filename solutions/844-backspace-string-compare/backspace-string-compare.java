class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(sb.length() > 0 && s.charAt(i) == '#'){
                sb.deleteCharAt(sb.length()-1);
            }else if(s.charAt(i) != '#'){
                sb.append(s.charAt(i));
            }
        }

        StringBuilder tb = new StringBuilder();
        for(int i=0; i<t.length(); i++){
            if(tb.length() > 0 && t.charAt(i) == '#'){
                tb.deleteCharAt(tb.length()-1);
            }else if(t.charAt(i) != '#'){
                tb.append(t.charAt(i));
            }
        }

        return sb.toString().equals(tb.toString());
    }
}