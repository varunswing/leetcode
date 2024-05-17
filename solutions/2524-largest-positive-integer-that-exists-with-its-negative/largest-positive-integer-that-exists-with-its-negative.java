class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());

        int ans = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0){
                if(list.contains(Math.abs(nums[i]))){
                    return Math.abs(nums[i]);
                }
            }
        }
        
        return -1;
        
    }
}