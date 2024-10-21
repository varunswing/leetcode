class Solution {
    public List<String> removeAnagrams(String[] words) {
        Set<String> st = new HashSet();
        List<String> ans = new ArrayList<>();
        for(String s : words){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            if(st.contains(new String(c))){
                continue;
            }else{
                st = new HashSet();
                st.add(new String(c));
                ans.add(s);
            }
        }
        return ans;
    }
}