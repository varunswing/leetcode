

import static java.lang.Character.isUpperCase;

class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3){
            return false;
        }

        boolean isVowel = false;

        boolean isConsonant = false;

        for(Character s : word.toCharArray()){
            if(!Character.isDigit(s) && !Character.isLetter(s)){
                return false;
            }
        }

        for(Character s : word.toCharArray()){
            s = Character.toLowerCase(s);
            if(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u'){
                isVowel = true;
            }else if(Character.isLetter(s)){
                isConsonant = true;
            }
        }

        return isVowel && isConsonant;
        
    }
}