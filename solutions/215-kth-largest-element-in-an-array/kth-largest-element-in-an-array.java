class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Arrays.sort(nums);
        // return nums[nums.length - k];


        // PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        // for(int num: nums){
        //     queue.offer(num);
        // }
        // while(k > 1){
        //     queue.poll();
        //     k--;
        // }
        // return queue.poll();

        int[] arr = new int[20001];
        for(int num : nums){
            arr[num + 10000]++;
        }

        for(int i = arr.length - 1; i >= 0; i--){
            k -= arr[i];
            if(k <= 0){
                return i - 10000;
            }
        }
        return 0;
    }
}