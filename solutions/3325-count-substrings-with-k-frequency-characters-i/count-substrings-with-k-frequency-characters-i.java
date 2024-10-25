class Solution {
    public int numberOfSubstrings(String s, int k) {
        int[] freq = new int[26];
        int n = s.length();
        int ans = 0;

        if(k==1){
            return (n*(n+1))/2;
        }

        for(int i=0; i<n-1; i++){
            freq = new int[26];
            freq[s.charAt(i) - 'a']++;
            for(int j=i+1; j<n; j++){
                freq[s.charAt(j) - 'a']++;
                if(freq[s.charAt(j) - 'a'] >= k){
                    ans += n-j;
                    break;
                }
            }
        }
        return ans;
    }
}