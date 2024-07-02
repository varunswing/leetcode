class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Set<String> seen = new HashSet();
        
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char a = board[i][j];
                if(a == '.'){
                    continue;
                }
                
                if(seen.contains(a + "@row" + i) ||
                  seen.contains(a + "@col" + j) ||
                  seen.contains(a + "@box"+ i/3 + j/3)){
                    return false;
                }else{
                    seen.add(a + "@row" + i);
                    seen.add(a + "@col" + j);
                    seen.add(a + "@box" + i/3 + j/3);
                }
            }
        }
        return true;
    }
}