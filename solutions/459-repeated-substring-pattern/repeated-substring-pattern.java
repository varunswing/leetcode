class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String newS = s+s;
        return (newS).substring(1, newS.length()-1).contains(s);
    }
}