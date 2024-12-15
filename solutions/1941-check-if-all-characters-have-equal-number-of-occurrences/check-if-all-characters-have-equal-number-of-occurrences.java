class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];

        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }

        return Arrays.stream(freq).allMatch(f -> f == 0 || f == freq[s.charAt(0)-'a']);
    }
}