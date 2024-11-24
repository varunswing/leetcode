class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        Set<String> st = new HashSet(wordDict);
        boolean[] dp = new boolean[n+1];
        dp[0] = true;

        // for(int i=1; i<=n; i++){
        //     String prefix = s.substring(0, i);
        //     if(!dp[i-1]){
        //         continue;
        //     }else{
        //         for(int j=0; j<wordDict.size(); j++){
        //             if(wordDict.contains(prefix)){
        //                 dp[i+prefix.length()-1] = true;
        //             }
        //         }
        //     }
        // }

        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                if(!dp[j]){
                    continue;
                }else{
                    if(st.contains(s.substring(j, i))){
                        dp[i] = true;
                    }
                }
            }
        }
        return dp[n];
    }
}