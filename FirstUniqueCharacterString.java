class Solution {
    public int firstUniqChar(String s) {
        char c;

        List<Character> ss = new ArrayList();
        for(c = 'a'; c <= 'z'; ++c)
          ss.add(c);
        
        
        // for(int i=0; i<s.length(); i++){
        //     ss.add(s.charAt(i));
        // }
        // Map<Character, Integer> hm 
        //     = new HashMap<Character, Integer>(); 
        // for(int i=0; i<ss.size(); i++){
        //      hm.putIfAbsent(ss.get(i), Collections.frequency( 
        //                                  ss, ss.get(i))); 
        // }
        
        for(int i=0; i<s.length(); i++) {   
            int a = s.indexOf(s.charAt(i));
            if(a == s.indexOf(s.charAt(i), a+1) || -1 == s.indexOf(s.charAt(i), a+1)){
                return i;
            }
        }
        return -1;
    }
}
