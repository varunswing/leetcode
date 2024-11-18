class Solution {
  public boolean isDecomposable(String s) {
    int twos = 0;
    int groupLength = 0;
    char letter = '@';

    for (final char c : s.toCharArray())
      if (c == letter) {
        ++groupLength;
      } else {
        if (groupLength % 3 == 1)
          return false;
        if (groupLength % 3 == 2 && ++twos > 1)
          return false;
        groupLength = 1;
        letter = c;
      }

    if (groupLength % 3 == 1)
      return false;
    if (groupLength % 3 == 2 && ++twos > 1)
      return false;
    return twos == 1;
  }
}