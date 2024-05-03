class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int m = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            m = Math.max(m, candies[i]);
        }
        List<Boolean> ans = new ArrayList();
        for(int i=0; i<n; i++){
            if(candies[i] + extraCandies >= m){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
}