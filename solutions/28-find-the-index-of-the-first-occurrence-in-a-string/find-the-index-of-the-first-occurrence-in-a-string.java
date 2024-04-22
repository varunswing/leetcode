class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        
        int i=0, j=0;
        while(i<n && j<m){
            if(haystack.charAt(i) == needle.charAt(j)){
                j++;
            }else{
                if(j > 0 && haystack.charAt(i-1) == needle.charAt(j-1)){
                    i = i - j;
                }
                j=0;
            }
            i++;
            if(j==m){
                return i-m;
            }
        }
        if(j==m){
            return i-m;
        }
        return -1;
    }
}