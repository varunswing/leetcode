class Solution {
    public String longestNiceSubstring(String s) {
        if(s.length() < 2){
            return "";
        }

        Set<Character> st = new HashSet();
        for(Character c : s.toCharArray()){
            st.add(c);
        }

        String prev = null;
        String next = null;

        for(int i=0; i<s.length(); i++){
            if(st.contains(Character.toUpperCase(s.charAt(i))) && st.contains(Character.toLowerCase(s.charAt(i)))){
                continue;
            }

            prev = longestNiceSubstring(s.substring(0, i));
            next = longestNiceSubstring(s.substring(i+1));

            return prev.length() >= next.length() ? prev : next;
        }

        return s; 
    }
}