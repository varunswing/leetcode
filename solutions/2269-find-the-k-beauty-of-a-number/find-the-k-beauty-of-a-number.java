class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int count = 0;

        for(int i=0; i<=s.length()-k; i++){
            int a = Integer.valueOf(s.substring(i, i+k));
            if(a == 0) continue;
            if(num%a == 0){
                count++;
            }  
        }
        return count;
    }
}