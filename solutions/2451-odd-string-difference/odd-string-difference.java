class Solution {
    public String oddString(String[] words) {
        int n = words.length;
        int m = words[0].length();

        int[] diff = new int[m-1];

        for(int i=0; i<m-1; i++){
            if(words[0].charAt(i+1) - words[0].charAt(i) == words[1].charAt(i+1) - words[1].charAt(i)){
                diff[i] = words[0].charAt(i+1) - words[0].charAt(i);
            }else if(words[0].charAt(i+1) - words[0].charAt(i) == words[2].charAt(i+1) - words[2].charAt(i)){
                return words[i+1];
            }else{
                return words[i];
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m-1; j++){
                if(words[i].charAt(j+1) - words[i].charAt(j) != diff[j]){
                    return words[i];
                }
            }
        }

        return "";
    }
}