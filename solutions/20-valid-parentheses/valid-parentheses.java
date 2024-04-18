class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                st.push(s.charAt(i));
            }else{
                if(st.size() <= 0){
                    return false;
                }
                char a = st.peek();
                st.pop();
                if(s.charAt(i) == ')'){
                    if(a != '('){
                       return false;
                    }
                }
                if(s.charAt(i) == ']'){
                    if(a != '['){
                       return false;
                    }
                }if(s.charAt(i) == '}'){
                    if(a != '{'){
                       return false;
                    }
                }
            }
        }
        if(st.size() > 0){
            return false;
        }
        return true;
    }
}