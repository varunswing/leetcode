class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] charArray = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> s = new HashSet();
        for(String word  : words){
            StringBuilder sb = new StringBuilder();
            for(char c : word.toCharArray()){
                sb.append(charArray[c - 'a']);
            }
            s.add(sb.toString());
        }
        return s.size();
    }
}