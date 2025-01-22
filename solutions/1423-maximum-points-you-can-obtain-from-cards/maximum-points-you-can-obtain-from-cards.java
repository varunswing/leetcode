class Solution {
    public int maxScore(int[] cp, int k) {
        int sum=0, n = cp.length;
        for(int i=0;i<k;i++) sum+=cp[i];
        int ans = sum;

        for(int i=k-1,j=n-1;i>=0;i--,j--){
            
            sum=sum+cp[j]-cp[i];
            if(sum>ans) ans=sum;
            
        }
        return ans;
    }
}