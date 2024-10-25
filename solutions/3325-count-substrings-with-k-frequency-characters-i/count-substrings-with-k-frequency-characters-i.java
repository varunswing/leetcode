public class Solution {
    public int numberOfSubstrings(String s, int k) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] freqArr = new int[26];

            for (int j = i; j < s.length(); j++) {
                freqArr[s.charAt(j) - 'a']++;

                if (freqArr[s.charAt(j) - 'a'] == k) {
                    ans += s.length() - j;
                    break;
                }
            }
        }

        return ans;
    }
}