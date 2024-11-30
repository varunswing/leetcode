class Solution {
    public String toGoatLatin(String sentence) {
        String[] sen = sentence.split(" ");
        Set<Character> st = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        StringBuilder sb = new StringBuilder();
        int a = 1;
        for(int i=0; i<sen.length; i++){
            StringBuilder s = new StringBuilder(sen[i]);
            if(st.contains(sen[i].charAt(0))){
                s.append("ma");
            }else{
                char b = sen[i].charAt(0);
                s.deleteCharAt(0);
                s.append(b);
                s.append("ma");
            }
            for(int j=0; j<a; j++){
                s.append("a");
            }
            a++;
            if(i!=sen.length-1){
                s.append(" ");
            }
            sb.append(s);
        }

        return sb.toString();
    }
}