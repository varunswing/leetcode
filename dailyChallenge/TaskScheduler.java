class Solution {
    public int leastInterval(char[] tasks, int n) {
        int size = tasks.length;
        
        Map<Character, Integer> m = new HashMap();
        for(int i=0; i<size; i++){
            m.put(tasks[i], m.getOrDefault(tasks[i], 0) + 1);
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        
        int ans = 0;
        
        for(int count: m.values()){
            pq.offer(count);
        }
        
        
        while(!pq.isEmpty()){
            List<Integer> temp = new ArrayList();
            for(int i=0; i<n+1; i++){
                if(!pq.isEmpty()){
                    int freq = pq.poll();
                    temp.add(freq-1);
                }
            }
            
            for(Integer val: temp){
                if(val>0)
                    pq.offer(val);
            }
            
            if(pq.isEmpty()){
                ans+=temp.size();
            }else{
                ans+=n+1;
            }            
        }
        
        return ans;
    }
}
