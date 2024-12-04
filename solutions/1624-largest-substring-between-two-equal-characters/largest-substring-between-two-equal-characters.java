class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        
        int[] mp = new int[26];
        Arrays.fill(mp, -1);

        int ans = -1;
        for(int i=0; i<s.length(); i++){
            int c = s.charAt(i) - 'a';
            if(mp[c] >= 0){
                ans = Math.max(i - mp[c] - 1, ans);
            }else{
                mp[c] = i;
            }
        }
        return ans;
    }
}