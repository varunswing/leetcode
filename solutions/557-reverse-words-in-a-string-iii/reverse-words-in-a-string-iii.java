class Solution {

    private static void reverse(int i, int j, char[] c){
        while(i <= j){
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }
    }
    public String reverseWords(String s) {
        char[] c = s.toCharArray();
        int n = c.length;
        for(int i = 0; i < n; ){
            int j = i;
            while(j < n && c[j] != ' '){
                j++;      
            }
            reverse(i, j - 1, c);
            i = j + 1;
        }
        return new String(c);
    }
}