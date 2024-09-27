class Solution {
  public long validSubstringCount(String word1, String word2) {
    long ans = 0;
    int required = word2.length();
    int[] count = new int[26];

    for (final char c : word2.toCharArray())
      ++count[c - 'a'];

    for (int l = 0, r = 0; r < word1.length(); ++r) {
      if (--count[word1.charAt(r) - 'a'] >= 0)
        --required;
      while (required == 0) {
        ans += word1.length() - r;
        if (++count[word1.charAt(l++) - 'a'] > 0)
          ++required;
      }
    }

    return ans;
  }
}