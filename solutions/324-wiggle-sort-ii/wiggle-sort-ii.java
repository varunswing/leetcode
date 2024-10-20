class Solution {
    public void wiggleSort(int[] nums) {
        int[] sortedArray = nums.clone();
        Arrays.sort(sortedArray);
        
        int n = nums.length;
        int midIndex = (n-1)/2;
        int highIndex = n - 1;
        
        for (int k = 0; k < n; ++k) {
            if (k % 2 == 0) {
                nums[k] = sortedArray[midIndex--];
            } else {
                nums[k] = sortedArray[highIndex--];
            }
        }
    }
}