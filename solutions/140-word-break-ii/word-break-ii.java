class Solution {

    List<String> ans = new ArrayList<>();
    public List<String> wordBreak(String s, List<String> wordDict) {
        backtrack(0, s, new StringBuilder(), wordDict);
        return ans;
    }


    private void backtrack(int index, String s, StringBuilder currSentence, List<String> wordDict){

        if(index == s.length()){
            ans.add(currSentence.toString().trim());
            return;
        }


        for(int i = index; i < s.length(); i++){
            String word =s.substring(index, i + 1);
            if(wordDict.contains(word)){
                int currLen = currSentence.length();
                currSentence.append(word).append(" ");
                backtrack( i + 1, s, currSentence, wordDict);
                currSentence.setLength(currLen);
            }

        }

    }
}