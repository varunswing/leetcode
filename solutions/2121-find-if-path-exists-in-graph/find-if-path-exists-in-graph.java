class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        Map<Integer, List<Integer>> m = new HashMap();

        if(n==1){
            return true;
        }

        for(int i=0; i<edges.length; i++){
            m.putIfAbsent(edges[i][0], new ArrayList<>());
            m.putIfAbsent(edges[i][1], new ArrayList<>());
            
            m.get(edges[i][0]).add(edges[i][1]);
            m.get(edges[i][1]).add(edges[i][0]);
        }

        boolean[] vis = new boolean[n];

        List<Integer> l = m.get(source);

        if(l.size() == 0){
            return false;
        }

        vis[source] = true;

        for(int i=0; i<l.size(); i++){
            if(!vis[l.get(i)]){
                // System.out.println(l.get(i));
                dfs(m, vis, l.get(i));
            }
        }

        return vis[destination];
    }

    public void dfs(Map<Integer, List<Integer>> m, boolean[] vis, int curr){

        List<Integer> l = m.get(curr);

        if(l.size() == 0 || vis[curr]){
            return;
        }

        vis[curr] = true;

        for(int i=0; i<l.size(); i++){
            if(!vis[l.get(i)]){
                dfs(m, vis, l.get(i));
            }
        }

    }
}