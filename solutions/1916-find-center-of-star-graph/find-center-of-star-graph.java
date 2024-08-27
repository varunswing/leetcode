class Solution {
    public int findCenter(int[][] edges) {
        
        int n = edges.length;

        int[] id = new int[n+2];
        int ans = 0;
        int sum = 0;

        for(int[] edge : edges){
            id[edge[1]]++;
            id[edge[0]]++;
            if(id[edge[1]] > sum){
                sum = id[edge[1]];
                ans = edge[1];
            }
            if(id[edge[0]] > sum){
                sum = id[edge[0]];
                ans = edge[0];
            }
        }

        return ans;
    }
}