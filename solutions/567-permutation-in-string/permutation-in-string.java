class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.contains(s1)) return true;

        int req = s1.length();
        int[] c = new int[26];
        for(int i=0; i<s1.length(); i++){
            c[s1.charAt(i) - 'a']++;
        }

        for(int j=0, i=0; i<s2.length(); i++){
            if(--c[s2.charAt(i) - 'a'] >= 0){
                req--;
            }
            while(req == 0){
                if(i-j+1 == s1.length()){
                    return true;
                }
                if(++c[s2.charAt(j++)-'a'] > 0){
                    req++;
                }
            }
        }

        return false;
    }
}