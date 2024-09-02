class Solution {
    public String getSmallestString(String s) {

        for(int i=0; i<s.length()-1; i++){
            int a = Character.getNumericValue(s.charAt(i));
            int b = Character.getNumericValue(s.charAt(i+1));

            if((a%2 == 0 && b%2 == 0 && b < a) || (a%2 != 0 && b%2!=0 && b < a)){
                StringBuilder sb = new StringBuilder(s);
                String ab = String.valueOf(a);
                String bb = String.valueOf(b);
                sb.setCharAt(i, bb.charAt(0));
                sb.setCharAt(i+1, ab.charAt(0));
                return sb.toString();
            }
        }
        return s;
    }
}