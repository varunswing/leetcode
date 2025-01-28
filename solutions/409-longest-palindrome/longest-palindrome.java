class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[123];

        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)]++;
        }

        int ans = 0;
        int cnt = -1;
        for(int i=0; i<123; i++){
            ans+=freq[i];
            if(freq[i] > 0 && (freq[i]&1) != 0){
                cnt++;
            }
        }

        if(cnt < 0){
            return ans;
        }

        return ans-cnt;
    }
}