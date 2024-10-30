class Solution {
    public boolean makeEqual(String[] words) {
        int[] m = new int[26];
        int n = words.length;

        for(String s : words){
            for(Character c : s.toCharArray()){
                m[c-'a']++;
            }
        }

        return Arrays.stream(m).allMatch(c -> c%n == 0);
    }
}