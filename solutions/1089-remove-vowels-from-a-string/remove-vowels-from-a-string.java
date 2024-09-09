class Solution {
    public String removeVowels(String s) {
        Map<Character, Integer> m = new HashMap();
        m.put('a', 1);
        m.put('e', 1);
        m.put('i', 1);
        m.put('o', 1);
        m.put('u', 1);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(m.get(s.charAt(i)) != null){
                continue;
            }
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}