class Solution {
    public boolean canAliceWin(int[] nums) {
        return Arrays.stream(nums).map(a -> a >= 10 ? a : -a).sum() != 0;
    }
}
