class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        Map<Character, Character> m = new HashMap();
        for(int i=0; i<n; i++){
            if(m.get(s.charAt(i)) != null){
                if(m.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }else{
                if(m.containsValue(t.charAt(i))){
                    return false;
                }
                m.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
        
    }
}
