class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k == 1){
            return nums;
        }
        int l = 0, r = 0, mi = 0, m = Integer.MIN_VALUE;
        int n = nums.length;
        int[] arr = new int[n-k+1];
        Deque<Integer> q = new ArrayDeque<>();
        
        
        for(r=0; r<n; r++){
            if(q.size() > 0){
                while(q.peek() < l){
                    q.remove();
                }
                if(nums[q.peek()] > nums[r]){
                    while(q.size()>0 && nums[q.peekLast()] < nums[r]){
                        q.pollLast();
                    }
                    q.offer(r);
                }else{
                    while(q.size() > 0){
                        q.remove();
                    }
                    q.add(r);
                }
                
            }else{
                q.add(r);
            }
            if(r+1 >= k){
                arr[l] = nums[q.peek()];
            }
            if(r-l+1 == k){
                l++;
            }
            
        }
        
        return arr;
        
        
    }
}
