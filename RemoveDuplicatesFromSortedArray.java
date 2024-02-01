class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;

        int left = 0;
        int right = 1;

        while (right < len) {
            if (nums[right] > nums[left]) {
                left++;
                nums[left] = nums[right];
            }

            right++;
        }

        return left + 1;
    }
}
