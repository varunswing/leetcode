class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));
        
        List<int[]> ans = new ArrayList<>();
        
        for(int[] interval : intervals){
            if(ans.size() == 0 || ans.get(ans.size()-1)[1] < interval[0]){
                ans.add(interval);
            }else{
                ans.get(ans.size()-1)[1] = Math.max(ans.get(ans.size()-1)[1], interval[1]);
            }
        }
        
        return ans.toArray(int[][] ::new);
        
    }
}