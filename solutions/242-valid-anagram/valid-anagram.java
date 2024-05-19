class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        
        int[] count = new int[26];
        
        for(char si: s.toCharArray()){
            count[si - 'a']++;
        }
        
        for(char si: t.toCharArray()){
            if(count[si-'a'] == 0){
                return false;
            }
            count[si - 'a']--;
        }
        return true;
    }
}