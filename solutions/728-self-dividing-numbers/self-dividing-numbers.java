class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        while(left <= right){
            boolean flag = false;
            int num = left;
            while(num != 0){
                int a = num%10;
                if(a == 0 || left%a != 0){
                    flag = true;
                    break;
                }
                num /= 10;
            }
            if(!flag){
                ans.add(left);
            }
            left++;

        }
        return ans;
    }
}