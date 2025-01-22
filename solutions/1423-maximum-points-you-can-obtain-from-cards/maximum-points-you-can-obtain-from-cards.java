class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int res = 0;

        int ls = 0;
        int rs = 0;

        for(int i=0; i<k; i++){
            ls += cardPoints[i];
        }

        int dp = ls;

        int i = k-1;
        int j = cardPoints.length-1;

        while(i >= 0){
            ls -= cardPoints[i];
            i--;
            rs += cardPoints[j];
            j--;
            dp = Math.max(dp, ls+rs);
        }
        return dp;
    }

}