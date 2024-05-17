class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewel = jewels.chars().mapToObj(c->(char) c).collect(Collectors.toSet());
        int ans = 0;   
        for(char arr: stones.toCharArray()){
            if(jewel.contains(arr)){
                ans++;
            }
        }
        return ans;
    }
}