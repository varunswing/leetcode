class Solution {
    public long validSubstringCount(String word1, String word2) {
        long ans = 0;
        int[] count = new int[26];

        for(int i=0; i<word2.length(); i++){
            count[word2.charAt(i) - 'a']++;
        }

        int req = word2.length();

        for(int j=0, k=0; k<word1.length(); k++){
            if(--count[word1.charAt(k) - 'a'] >= 0){
                req--;
            }
            while(req == 0){
                ans += word1.length() - k;
                if(++count[word1.charAt(j++) - 'a'] > 0){
                    req++;
                }
            }
        }

        return ans;
    }
}