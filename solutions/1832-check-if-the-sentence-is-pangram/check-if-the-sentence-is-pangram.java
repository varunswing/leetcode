class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] all = new int[26];
        int n = sentence.length();
        if(n<26){
            return false;
        }

        for(char c : sentence.toCharArray()){
            all[c-'a']++;
        }

        for(int i=0; i<26; i++){
            if(all[i] <= 0){
                return false;
            }
        }

        return true;
    }
}