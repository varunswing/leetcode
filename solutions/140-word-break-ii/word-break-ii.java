class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> st = new HashSet(wordDict);
        Map<String, List<String>> resMap = new HashMap();
        return backtrack(s, st, resMap);
    }


    public List<String> backtrack(String s, Set<String> wordSet, Map<String, List<String>> memo) {
        if(memo.containsKey(s)){
            return memo.get(s);
        }

        List<String> ans = new ArrayList<>();

        for (int end = 1; end <= s.length(); end++) {
            String prefix = s.substring(0, end);
            if (wordSet.contains(prefix)) {
                List<String> subList = backtrack(s.substring(end), wordSet, memo);
                if (subList.isEmpty() && end == s.length()) {
                    ans.add(prefix);
                }
                for (String sub : subList) {
                    ans.add(prefix + " " + sub);
                }
            }
        }

        memo.put(s, ans);
        return ans;
    }
}