class Solution {
    public String interpret(String command) {
//         for(int i=0; i<command.length(); i++){
//             if(command.charAt(i) == 'G'){
                
//             }
//         }
        String a = command.replaceAll("\\(al\\)", "al");
        String b = a.replaceAll("\\(\\)", "o");
        return b;
    }
}