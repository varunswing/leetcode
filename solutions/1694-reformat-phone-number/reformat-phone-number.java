class Solution {
    public String reformatNumber(String number) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<number.length(); i++){
            if(number.charAt(i) != '-' && number.charAt(i) != ' '){
                sb.append(number.charAt(i));
            }
        }

        int n = sb.length();
        int i = 0;
        while(n > 4){
            i+=3;
            sb.insert(i, "-");
            n = sb.substring(i+1).length();
            if(n > 4){
                i++;
            }
        }

        if(n == 4){
            sb.insert(sb.length() - 2, "-");
        }
        

        return sb.toString();
    }
}