class Solution {
    public int diagonalPrime(int[][] nums) {
        List<Integer> dia = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            dia.add(nums[i][i]);
            dia.add(nums[i][nums.length - 1 - i]);
        }

        Collections.sort(dia);
        int ans = 0;


        for(int i=dia.size()-1; i>=0; i--){
            boolean flag = false;
            int a = dia.get(i);
            for(int j=(int) Math.sqrt(a); j > 1; j--){
                if(a%j == 0){
                    flag = true;
                    break;
                }
            }
            if(!flag && a != 1){
                return a;
            }
        }

        return ans;
    }
}