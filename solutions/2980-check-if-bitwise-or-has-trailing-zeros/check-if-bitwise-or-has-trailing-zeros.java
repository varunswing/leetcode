class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        return Arrays.stream(nums).filter(a -> (a&1) == 0).count() >= 2;
    }
}