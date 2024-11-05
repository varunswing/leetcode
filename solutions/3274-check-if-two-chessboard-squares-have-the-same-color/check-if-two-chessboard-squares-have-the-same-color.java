class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        Map<Character, Integer> m = new HashMap<>();

        m.put('a', 1);
        m.put('b', 2);
        m.put('c', 3);
        m.put('d', 4);
        m.put('e', 5);
        m.put('f', 6);
        m.put('g', 7);
        m.put('h', 8);

        int a = m.get(coordinate1.charAt(0)) + Integer.valueOf(coordinate1.charAt(1));
        int b = m.get(coordinate2.charAt(0)) + Integer.valueOf(coordinate2.charAt(1));

        return a%2 == b%2;
    }
}