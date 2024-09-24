class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int s1 = 0, s2 = 0;
        for(int i=0; i<nums1.length; i++){
            s1 += nums1[i];
            s2 += nums2[i];
        }
        
        return (s2-s1)/nums1.length;
    }
}