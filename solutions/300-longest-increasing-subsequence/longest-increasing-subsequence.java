class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        
        List<Integer> a = new ArrayList();
        int ans = 0;
        
        for(int i=0; i<n; i++){
            int index = binarySearch(a, nums[i]);
            
            if(index == a.size()){
                a.add(nums[i]);
            }else{
                a.set(index, nums[i]);
            }
            
        }

        return a.size();
    }
    
    private int binarySearch(List<Integer> sorted, int target) {
        int left = 0, right = sorted.size();
        int result = sorted.size();
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (sorted.get(mid) < target) {
                left = mid + 1;
            } else {
                result = mid;
                right = mid;
            }
        }
        return result;
    }
}