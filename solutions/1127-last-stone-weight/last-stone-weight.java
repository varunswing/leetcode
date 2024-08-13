class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> pq = new PriorityQueue(Collections.reverseOrder());

        for(int stone : stones){
            pq.offer(stone);
        }

        while(pq.size() >=2){
            int a = pq.poll();
            int b = pq.poll();

            if(a != b){
                pq.offer(Math.abs(a-b));
            }
        }

        return pq.isEmpty() ? 0 : pq.peek();

    }
}