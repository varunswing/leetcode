class Solution {
    
    public static boolean isPalindrome(String str) {
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return cleanStr.equals(new StringBuilder(cleanStr).reverse().toString());
    }
    
    public boolean validPalindrome(String s) {
        int n = s.length();
        if(isPalindrome(s)){
            return true;
        }
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
                String so = s;
                String st = s;
                String os = so.substring(0, i) + so.substring(i + 1);
                
                String ts = st.substring(0, n-1-i) + st.substring(n-1-i + 1);
                
                if(isPalindrome(os) || isPalindrome(ts)){
                    System.out.println("b");
                    return true;
                }
                return false;
            }
        }
        System.out.println("c");
        return true;
    }
}