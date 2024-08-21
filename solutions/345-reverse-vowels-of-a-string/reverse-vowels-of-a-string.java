class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        Set<Character> vowels = new HashSet();
        String vowelsString = "aeiouAEIOU";
        for (int i = 0; i < vowelsString.length(); i++) {
            vowels.add(vowelsString.charAt(i));
        }

        Stack<Character> stack = new Stack();

        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))){
                stack.push(s.charAt(i));
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))){
                char a = stack.pop();
                sb.setCharAt(i, a);
            }
        }

        return sb.toString();

    }
}