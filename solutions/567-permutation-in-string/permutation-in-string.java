class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.contains(s1)) return true;

        int n = s1.length();
        int m = s2.length();

        char[] c = s1.toCharArray();
        Arrays.sort(c);
        String s5 = new String(c);

        for(int i=n; i<=m; i++){
            String s3 = s2.substring(i-n, i);
            char[] d = s3.toCharArray();
            Arrays.sort(d);

            String s4 = new String(d);

            if(s4.contains(s5)) return true;
        }

        return false;
    }
}