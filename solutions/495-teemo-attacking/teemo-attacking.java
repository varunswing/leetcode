class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int np = timeSeries[0]+duration;
        int lp = timeSeries[0];
        int sum = np-timeSeries[0];

        for(int i=1; i<timeSeries.length; i++){
            lp = np;
            np = timeSeries[i]+duration;
            sum += Math.min(np-lp, np-timeSeries[i]);
        }

        return sum;
        
    }
}