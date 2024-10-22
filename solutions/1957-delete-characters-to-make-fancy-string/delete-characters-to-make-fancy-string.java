class Solution {
    public String makeFancyString(String s) {
        char repeated = '#', prev = '#';
        StringBuilder res = new StringBuilder();
        for (char ch: s.toCharArray()){
            if(repeated == ch){
                continue;
            }
            if(prev == ch){
                repeated = ch;
            }else{
                repeated = '#';
            }
            prev = ch;
            res.append(ch);
        }
        return res.toString();
    }
}