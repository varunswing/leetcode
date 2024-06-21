class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int ans = 0;
        for(int i=0; i<nums2.length; i++){
            for(int j=0; j<nums1.length; j++){
                if(nums1[j]%(nums2[i]*k) == 0){
                    ans++;
                } 
            }
        }
        return ans;
    }
}