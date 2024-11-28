class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] s = paragraph.replaceAll("\\W+", " ").split(" ");
        Set<String> set = new HashSet(Arrays.asList(banned));
        Map<String, Integer> m = new HashMap<>();
        
        int ans = 0;
        String res = "";
        
        for(String st : s){
            st = st.toLowerCase();
            if(!set.contains(st)){
                m.put(st, m.getOrDefault(st, 0)+1);
            }
            if(m.get(st) != null && m.get(st).intValue() > ans){
                ans = m.get(st);
                res = st;
            }
            
        }

        return res;
    }
}