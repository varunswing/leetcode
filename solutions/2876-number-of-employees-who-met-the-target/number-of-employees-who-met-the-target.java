class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        return (int) Arrays.stream(hours).filter(a -> a >= target).count();
    }
}