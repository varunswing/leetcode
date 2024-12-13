class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());

        for(int n : gifts){
            pq.add(n);
        }

        for(int i=0; i<k; i++){
            int a = pq.poll();
            pq.add((int)Math.sqrt(a));
        }

        long ans = 0;

        for(int i=0; i<gifts.length; i++){
            ans += pq.poll();
        }

        return ans;
    }
}