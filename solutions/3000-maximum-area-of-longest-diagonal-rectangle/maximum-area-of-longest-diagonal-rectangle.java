class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int res = 0;
        double dm = 0;

        for(int[] dia : dimensions){
            double nd = Math.sqrt(dia[0]*dia[0] + dia[1]*dia[1]);
            if(nd > dm){
                dm = nd;
                res = dia[0]*dia[1];
            }else if(nd == dm){
                res = Math.max(res, dia[0]*dia[1]);
            }
        }

        return res;
    }
}