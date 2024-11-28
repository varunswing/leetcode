class Solution {
    public int sumOfDigits(int[] nums) {
        int mn = Arrays.stream(nums).min().getAsInt();

        int ans = 0;
        while(mn > 0){
            ans += mn%10;
            mn /=10;
        }

        return ans&1^1;
    }
}