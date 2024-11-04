class Solution {
    public int[] constructRectangle(int area) {
        int l = 0;
        int b = 0;
        for(int i=(int) Math.sqrt(area); i>=1; i--){
            if(area%i == 0){
                b = i;
                l = area/i;
                break;
            }
        }
        return new int[]{l, b};
    }
}