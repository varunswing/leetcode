class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean present[] = new boolean[123];

        for(char c : allowed.toCharArray()){
            present[c] = true;
        }

        int ans = 0;
        boolean flag = false;
        for(String s : words){
            flag = false;
            for(char c : s.toCharArray()){
                if(present[c] == false){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                ans++;
            }
        }
        return ans;
        
    }
}