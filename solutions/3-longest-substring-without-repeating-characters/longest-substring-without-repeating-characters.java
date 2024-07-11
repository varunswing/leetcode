class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n <= 1){
            return n;
        }
        int i = 0;
        int j = 1;
        
        Map<Character, Integer> m = new HashMap();
        m.put(s.charAt(i), i);
        int ans = 0;
        while(j<n){
            if(m.get(s.charAt(j)) != null){
                i = m.get(s.charAt(j)) + 1;
                m.clear();
                m.put(s.charAt(i), i);
                j = i;
            }else{
                m.put(s.charAt(j), j);
            }
            // System.out.println("i" + i + " j" + j);
            ans = Math.max(ans, j-i+1);
            // System.out.println(ans);
            j++;
        }
        return ans;
    }
}