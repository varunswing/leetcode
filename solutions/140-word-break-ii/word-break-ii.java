class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        Map<String, List<String>> memo = new HashMap<>();
        return backtrack(s, wordSet, memo);
    }

    public List<String> backtrack(String s, Set<String> wordDict, Map<String, List<String>> memo){
        if(memo.containsKey(s)){
            return memo.get(s);
        }

        List<String> ans = new ArrayList<>();

        for(int i=1; i<=s.length(); i++){
            String prefix = s.substring(0, i);
            if(wordDict.contains(prefix)){
                List<String> res = backtrack(s.substring(i), wordDict, memo);
                if(res.isEmpty() && i==s.length()){
                    ans.add(prefix);
                }
                for(String ss : res){
                    ans.add(prefix + " " + ss);
                }
            }
        }

        memo.put(s, ans);
        return ans;
    }
}