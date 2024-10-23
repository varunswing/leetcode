class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Map<Character, Integer> m = new HashMap<>();

        for(char c : allowed.toCharArray()){
            m.put(c, 1);
        }

        int ans = 0;
        boolean flag = false;
        for(String s : words){
            flag = false;
            for(char c : s.toCharArray()){
                if(m.get(c) == null){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                ans++;
            }
        }
        return ans;
        
    }
}