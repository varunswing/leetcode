class Solution {
    public boolean makeEqual(String[] words) {
        int[] m = new int[26];
        int n = words.length;

        for(String s : words){
            for(Character c : s.toCharArray()){
                m[c-'a']++;
            }
        }

        for(int i=0; i<26; i++){
            if(m[i] % n != 0){
                return false;
            }
        }
        return true;
    }
}