class Solution {

    int[] tmp = new int[1001];

    public int minCostClimbingStairs(int[] cost) {
        for(int i=0; i<1001; i++){
            tmp[i] = -1;
        }
        return Math.min(solve(0, cost), solve(1, cost));
    }

    public int solve(int i, int[] cost){
        if(i >= cost.length){
            return 0;
        }

        if(tmp[i] != -1){
            return tmp[i];
        }

        int a = cost[i] + solve(i+1, cost);
        int b = cost[i] + solve(i+2, cost);

        return tmp[i] = Math.min(a, b);
    }
}