class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int flag = 0;
        int count = 0;
        for(int i = n-1; i>=0; i--){
            if(s.charAt(i) != ' '){
                flag = 1;
            }
            if(flag == 1){
                if(s.charAt(i) == ' '){
                    break;
                }
                count++;
            }
        }
        return count;
    }
}
