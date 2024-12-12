class Solution {
    public int maxDistance(int[] colors) {
        final int n = colors.length;
        int i = 0;     
        int j = n - 1; 
        while (colors[i] == colors[n - 1])
        ++i;
        while (colors[j] == colors[0])
        --j;
        return Math.max(n - 1 - i, j);
    }
}