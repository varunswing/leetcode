class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> m = new HashMap();
        for(int i=0; i<stones.length(); i++){
            m.put(stones.charAt(i), m.getOrDefault(stones.charAt(i), 0) + 1);
            // System.out.println(m.get(stones.charAt(i)));
        }
        
        int ans = 0;
        for(int i=0; i<jewels.length(); i++){
            ans += m.getOrDefault(jewels.charAt(i), 0);
        }
        return ans;
    }
}