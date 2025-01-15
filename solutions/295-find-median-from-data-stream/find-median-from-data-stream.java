class MedianFinder {
    private PriorityQueue<Integer> mh = new PriorityQueue(Collections.reverseOrder());
    private PriorityQueue<Integer> mih = new PriorityQueue();

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(mh.isEmpty() || num <= mh.peek()){
            mh.offer(num);
        }else{
            mih.offer(num);
        }

        if(mih.size() > mh.size()){
            mh.offer(mih.poll());
        }else if(mh.size() - mih.size() > 1){
            mih.offer(mh.poll());
        }
    }
    
    public double findMedian() {
        if(mh.size() > mih.size()){
            return (double) mh.peek();
        }
        return (double)(mih.peek() + mh.peek())/2.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */