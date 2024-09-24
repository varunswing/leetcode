class Solution {
    public boolean isValid(String word) {
        return word.length() >= 3 && word.chars().allMatch(Character::isLetterOrDigit) && word.chars().anyMatch(c -> isVowel((char) c)) && word.chars().anyMatch(c -> isConsonant((char) c));
    }

    public boolean isVowel(Character c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public boolean isConsonant(Character c){
        return Character.isLetter(c) && !isVowel(c);
    }
}