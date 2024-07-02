class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        String[] array = new String[n];
        List<List<String>> ans = new ArrayList();
        
        Map<String, List<String>> m = new HashMap();
        
        for (int i = 0; i < strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            array[i] = new String(charArray);
            if(m.containsKey(array[i])){
                List<String> temp = m.get(array[i]);
                temp.add(strs[i]);
            }else{
                List<String> temp = new ArrayList();
                temp.add(strs[i]);
                m.put(array[i], temp);
            }
        }
        
        for(String key : m.keySet()){
            ans.add(m.get(key));
        }
        
        return ans;
    }
}