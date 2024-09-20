class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] duplicates = new int[2];
        int[] count = new int[nums.length];
        int a = 0;

        for(int num : nums){
            if(++count[num] == 2){
                duplicates[a++] = num;
            }
        }

        return duplicates;
    }
}