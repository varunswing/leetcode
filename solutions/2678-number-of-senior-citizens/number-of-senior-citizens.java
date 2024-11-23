class Solution {
    public int countSeniors(String[] details) {
        int ans = 0;
        for(String s : details){
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(11));
            sb.append(s.charAt(12));
            if(Integer.valueOf(sb.toString()) > 60){
                ans++;
            }
        }
        return ans;
    }
}