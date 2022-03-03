
bool compare(const pair<int, int>&a, const pair<int, int>&b){
   return a.second<b.second;
}

class Solution {
public:
    
    int minimumOperations(vector<int>& nums) {
        int ans = 0;
        int sizee = 0;
        int sizeo = 0;
        int n = nums.size();
        
        if(n%2 == 0){
            sizee = n/2;
            sizeo = n/2;
        }else{
            sizee = n/2 + 1; 
            sizeo = n/2;
        }
        map<int, int> ne;
        map<int, int> no;
        for(int i=0; i<n; i++){
            if(i%2 == 0){
                ne[nums[i]]++;
            }else{
                no[nums[i]]++;
            }
        }
        int ae = max_element(ne.begin(), ne.end(), compare)->second;
        int ao = max_element(no.begin(), no.end(), compare)->second;
        int ve = max_element(ne.begin(), ne.end(), compare)->first;
        int vo = max_element(no.begin(), no.end(), compare)->first;
        ne[ve] = 0;
        no[vo] = 0;
        int se = max_element(ne.begin(), ne.end(), compare)->second;
        int so = max_element(no.begin(), no.end(), compare)->second;
        
        if(vo != ve || se==ae || so == ao){
            ans = (sizee - ae) + (sizeo - ao);
        }else{
            if(ae < ao){
                ans = (sizee - se) + (sizeo - ao);
            }else if(ao > ae){
                ans = (sizee - ae) + (sizeo - so);
            }else{
                if(se > so){
                    ans = (sizee - se) + (sizeo - ao);
                }else{
                    ans = (sizee - ae) + (sizeo - so);
                }
            }
        }
        
        return ans;
        
    }
    
    
};