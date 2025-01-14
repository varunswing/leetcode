class Solution {
    public int characterReplacement(String s, int k) {
        int[] f = new int[26];

        int l = 0;
        int r = 0;

        int m = 0;

        for(r = 0; r<s.length(); r++){
            m = Math.max(m, ++f[s.charAt(r) - 'A']);
            if(m + k < r - l + 1){
                f[s.charAt(l++) - 'A']--;
            }
        }

        return r - l;
    }
}