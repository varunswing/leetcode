class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Pair<Integer, Integer>> s = new Stack<>();
        int[] ans = new int[n];
        int count = 0;
        s.push(new Pair(temperatures[n-1], 1));
        ans[n-1] = 0;
        for(int i=n-2; i>=0; i--){
            while(s.size() > 0){
                Pair<Integer, Integer> p = s.peek();
                if(p.getKey() > temperatures[i]){
                    ans[i] = n - i - p.getValue();
                    s.push(new Pair(temperatures[i], n-i));
                    break;
                }else{
                    s.pop();
                }
            }
            if(s.size() <= 0){
                ans[i] = 0;
                s.push(new Pair(temperatures[i], n-i));
            }
        }
        return ans;
    }
}
