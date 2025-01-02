
class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        for(int i=0; i<score.length; i++){
            pq.add(score[i]);
        }

        String[] s= new String[n];

        int count = 0;
        Map<Integer, String> m = new HashMap();
        while(pq.size() > 0){
            count++;
            int a = pq.poll();
            if(count == 1){
                m.put(a, "Gold Medal");
            }else if(count == 2){
                m.put(a, "Silver Medal");
            }else if(count == 3){
                m.put(a, "Bronze Medal");
            }else{
                m.put(a, String.valueOf(count));
            }
        }

        for(int i=0; i<n; i++){
            s[i] = m.get(score[i]);
        }

        return s;
    }
}