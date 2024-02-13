class Solution {
    public String firstPalindrome(String[] words) {
        for(int k=0; k<words.length; k++){
            char[] ch = words[k].toCharArray();
            int i=0, j = ch.length-1;
            if(ch.length == 1){
                return words[k];
            }
            while(i<j){
                if(ch[i] == ch[j]){
                    i++;
                    j--;
                }else{
                    break;
                }
                if(i >= j){
                    return words[k];
                }
            }
        }
        return "";
    }
}
