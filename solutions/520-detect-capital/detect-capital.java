class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length() < 2){
            return true;
        }
        boolean upper = false;
        boolean lower = false;
        boolean ul = false;

        if(Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))){
            upper = true;
        }else if(Character.isLowerCase(word.charAt(0)) && Character.isLowerCase(word.charAt(1))){
            lower = true;
        }else{
            ul = true;
        }

        for(int i=1; i<word.length(); i++){
            if(ul){
                if(Character.isUpperCase(word.charAt(i))){
                    return false;
                }
            }
            if(upper){
                if(Character.isLowerCase(word.charAt(i))){
                    return false;
                }
            }
            if(lower){
                if(Character.isUpperCase(word.charAt(i))){
                    return false;
                }
            }
        }
        return true;
    }
}