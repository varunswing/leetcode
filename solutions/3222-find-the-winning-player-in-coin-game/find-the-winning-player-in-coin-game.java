class Solution {
    public String winningPlayer(int x, int y) {
        int count = 0;
        int a = 1;
        int b = 4;
        while(true){
            if(count % 2 == 0){
                x -= a;
                if(x < 0){
                    return "Bob";
                }
                y -= b;
                if(y < 0){
                    return "Bob";
                }
            }else{
                x -= a;
                if(x < 0){
                    return "Alice";
                }
                y -= b;
                if(y < 0){
                    return "Alice";
                }
            }
            count++;
        }
    }
}