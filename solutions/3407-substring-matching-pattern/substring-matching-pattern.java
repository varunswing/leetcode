class Solution {
    public boolean hasMatch(String s, String p) {

        if(p.equals("*")){
            return true;
        }

        int a = p.indexOf("*");
        String pre = p.substring(0, a);
        String post = p.substring(a+1);

        int b = s.indexOf(pre);

        System.out.println("b " + b);

        String left = s.substring(b+pre.length());
        System.out.println("left " + left);
        int c = left.indexOf(post);
        System.out.println("c " + c);
        
        if(post.equals("")){
            if(b > -1){
                return true;
            }
        }

        if(pre.equals("")){
            if(c > -1){
                return true;
            }
        }
        
        if(b == -1){
            return false;
        }
        
        if(c == -1){
            return false;
        }

        return true;
    }
}