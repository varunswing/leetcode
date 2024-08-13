class KthLargest {

    List<Integer> list = new ArrayList();
    int l;

    public KthLargest(int k, int[] nums) {
        l = k;
        for(int i=0; i<nums.length; i++){
            list.add(nums[i]);
        }
    }
    
    public int add(int val) {
        list.add(val);
        Collections.sort(list);
        int n = list.size();
        if(n < l){
            return -1;
        }
        return list.get(n-l);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */