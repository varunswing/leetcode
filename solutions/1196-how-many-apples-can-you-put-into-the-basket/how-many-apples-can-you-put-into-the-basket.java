class Solution {
    public int maxNumberOfApples(int[] weight) {
        Arrays.sort(weight);

        int ans = 0;
        int sum = 0;
        for(int i=0; i<weight.length; i++){
            sum += weight[i];
            if(sum > 5000){
                return ans;
            }
            ans++;
        }

        return ans;
    }
}