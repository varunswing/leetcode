class Solution {
  public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
    return squareIsWhite(coordinate1) == squareIsWhite(coordinate2);
  }

  private boolean squareIsWhite(final String coordinates) {
    final char letter = coordinates.charAt(0);
    final char digit = coordinates.charAt(1);
    return letter % 2 != digit % 2;
  }
}