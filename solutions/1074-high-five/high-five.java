class Solution {
    public int[][] highFive(int[][] items) {
        Map<Integer, PriorityQueue<Integer>> m = new HashMap();
        List<int[]> ans = new ArrayList<>();

        for(int[] item : items){
            int id = item[0];
            int score = item[1];
            m.putIfAbsent(id, new PriorityQueue());
            PriorityQueue<Integer> pq = m.get(id);
            pq.add(score);
            if(pq.size() > 5){
                pq.poll();
            }
        }

        for(Map.Entry<Integer, PriorityQueue<Integer>> entry : m.entrySet()){
            int id = entry.getKey();
            PriorityQueue<Integer> scores = entry.getValue();

            int a = 0;
            while(scores.size() > 0){
                a += scores.poll();
            }
            ans.add(new int[]{id, a/5});
        }

        return ans.toArray(int[][] :: new);
    }
}