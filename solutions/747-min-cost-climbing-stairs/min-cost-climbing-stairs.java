class Solution {

    int[] tmp = new int[1001];

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        tmp[0] = cost[0];
        if(n==1){
            return tmp[0];
        }
        tmp[1] = cost[1];
        if(n==2){
            return Math.min(cost[0], cost[1]);
        }

        for(int i=2; i<n; i++){
            tmp[i] = cost[i] + Math.min(tmp[i-1], tmp[i-2]);
        }

        return Math.min(tmp[n-1], tmp[n-2]);
    }
}