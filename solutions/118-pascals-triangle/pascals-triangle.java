class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList();

        if(numRows == 0){
            return ans;
        }
        for(int i=0; i<numRows; i++){
            List<Integer> temp = new ArrayList();
            if(i==0){
                temp.add(1);
            }else{
                List<Integer> sol = ans.get(i-1);
                temp.add(1);
                for(int j=1; j<i; j++){
                    temp.add(sol.get(j) + sol.get(j-1));
                }
                temp.add(1);
            }
            ans.add(temp);
        }

        return ans;
    }
}