class Solution {
    public String reverseVowels(String s) {
    StringBuilder sb = new StringBuilder(s);
    int l = 0;
    int r = s.length() - 1;

        while (l < r) {
            while (l < r && !("aeiouAEIOU".indexOf(s.charAt(l)) != -1))
                ++l;
            while (l < r && !("aeiouAEIOU".indexOf(s.charAt(r)) != -1))
                --r;
            sb.setCharAt(l, s.charAt(r));
            sb.setCharAt(r, s.charAt(l));
            ++l;
            --r;
        }

            return sb.toString();
        }

}