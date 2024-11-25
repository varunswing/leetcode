class Solution {
    public boolean checkRecord(String s) {
        int count = 0;

        for(char c : s.toCharArray()){
            if(c == 'A'){
                count++;
                if(count > 1){
                    return false;
                }
            }
        }

        return s.contains("LLL") == false;
    }
}