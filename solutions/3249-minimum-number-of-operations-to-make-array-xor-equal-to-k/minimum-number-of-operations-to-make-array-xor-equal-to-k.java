class Solution {
    public int minOperations(int[] nums, int k) {
        int n = Arrays.stream(nums).reduce((a, b) -> a^b).getAsInt();
        return Integer.bitCount(n^k);
    }
}