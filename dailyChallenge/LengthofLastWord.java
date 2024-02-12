class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            if(' ' != s.charAt(i)){
                count++;
            }else{
                ans = count == 0 ? ans : count;
                count = 0;
            }
        }
        return count == 0 ? ans : count;
    }
}
