class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        dp[0] = true;

        for (int i=0; i<n; i++){
            if (!dp[i]){
                continue;
            }
            for (int j=0; j<wordDict.size(); j++) {
                String word = wordDict.get(j);
                if (s.startsWith(word, i)){
                    dp[i+word.length()] = true;
                }
            }
        }
        return dp[n];
    }
}