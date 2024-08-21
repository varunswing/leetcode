class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList();

        List<Integer> temp = new ArrayList();
        for(int i=0; i<=rowIndex; i++){
            temp = new ArrayList();
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

        return ans.get(rowIndex);
    }
}