class Solution {
    public int characterReplacement(String s, int k) {
        int r = 0;
        int l = 0;

        int[] count = new int[26];
        int maxCount = 0;
        int ans = 0;

        while(r < s.length()){
            maxCount = Math.max(maxCount, ++count[s.charAt(r) - 'A']);
            while(maxCount + k < r - l + 1){
                --count[s.charAt(l++) - 'A'];
            }
            ans = Math.max(ans, r - l + 1);
            r++;
        }
        return ans;
    }
}