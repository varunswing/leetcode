class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int ans = 0;
        int prev = 0;
        int res = 0;
        for(int[] emp : logs){
            if(emp[1] - prev >= ans){
                if(emp[1] - prev == ans){
                    res = Math.min(res, emp[0]);
                }else{
                    res = emp[0];
                }
                ans = emp[1] - prev;
            }
            prev = emp[1];
            
        }
        return res;
    }
}