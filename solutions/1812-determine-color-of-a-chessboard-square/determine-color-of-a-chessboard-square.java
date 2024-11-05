class Solution {
    public boolean squareIsWhite(String coordinates) {
        char letter = coordinates.charAt(0);
        char digit = coordinates.charAt(1);
        return letter%2 != digit %2;
    }
}