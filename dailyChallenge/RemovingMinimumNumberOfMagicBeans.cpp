class Solution {
public:
    long long minimumRemoval(vector<int>& beans) {
        if(beans.size() == 1){
            return 0;
        }
        long long ans = LLONG_MAX;
        sort(beans.begin(), beans.end());
        long long sum = 0;
        for(int i=0; i<beans.size(); i++){
            sum += beans[i];
        }
        
        
        long long t = 0;
        for(int i=0; i<beans.size(); i++){
            long long a = sum - ((beans.size()-i)*beans[i]);
            ans = min(ans, a);
        }
        
        return ans;
    }
};