class Solution {
    Map<Integer, Integer> m = new HashMap();
    public boolean isHappy(int n) {
        if(n==1){
            return true;
        }

        int sum = 0;
        int a = n;
        while(a > 0){
            int b = a%10;
            sum += b*b;
            a /= 10;
        }

        if(sum==1){
            return true;
        }

        if(m.get(sum) != null){
            return false;
        }
        m.put(sum, 1);

        return isHappy(sum);

    }
}