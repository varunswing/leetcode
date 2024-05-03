class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int m = 0;
        List<Integer> a = new ArrayList();
        for(int i=0; i<points.length; i++){
            a.add(points[i][0]);
        }
        
        Collections.sort(a);
        for(int i=0; i<points.length-1; i++){
            m = Math.max(m, a.get(i+1) - a.get(i));
        }
        return m;
    }
}