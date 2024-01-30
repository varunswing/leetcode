class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> s = new Stack<>();
        int res = 0;
        for(int i=0; i<tokens.length; i++){
            if(tokens[i].equals("+") || tokens[i].equals("/") || tokens[i].equals("-") || tokens[i].equals("*")){
                int b = Integer.parseInt(s.peek());
                s.pop();
                int a = Integer.parseInt(s.peek());
                s.pop();
                int c = 0;
                if(tokens[i].equals("+")){
                    c = a + b;
                }else if(tokens[i].equals("-")){
                    c = a-b;
                }else if(tokens[i].equals("/")){
                    c = a/b;
                }else if(tokens[i].equals("*")){
                    c = a*b;
                }
                s.push(String.valueOf(c));
            }else{
                s.push((tokens[i]));
            }
        }
        return Integer.parseInt(s.peek());
    }
}
