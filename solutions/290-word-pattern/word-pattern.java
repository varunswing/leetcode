class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> m = new HashMap();

        String[] sa = s.split(" ");

        if(sa.length != pattern.length()){
            return false;
        }

        for(int i=0; i<sa.length; i++){
            if(m.get(pattern.charAt(i)) != null){
                if(!m.get(pattern.charAt(i)).equals(sa[i])){
                    return false;
                }
            }else if(m.containsValue(sa[i])){
                return false;
            }else{
                m.put(pattern.charAt(i), sa[i]);
            }

        }

        return true;
    }
}