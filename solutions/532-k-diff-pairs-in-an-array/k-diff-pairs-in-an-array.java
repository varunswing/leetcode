class Solution {
    public int findPairs(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        
        HashMap<Integer, Integer> m = new HashMap();
        
        
        
        // if(k==0){
        //     for(int i=0; i<n; i++){
        //         if(m.get(nums[i]) != null){
        //             ans++;
        //         }else{
        //             m.put(nums[i], true);
        //         }
        //     }
        //     return ans;
        // }
        
        for(int i=0; i<n; i++){
            m.put(nums[i], i);
        }
        
        for(int i=0; i<n; i++){
            
            if(m.get(nums[i]-k) != null && m.get(nums[i]-k) != i && m.get(nums[i]) != null){
                ans++;
                System.out.println("-" + nums[i]);
                if(k == 0){ 
                    m.remove(nums[i]);
                }
            }
            if(m.get(nums[i]+k) != null && m.get(nums[i]+k) != i && m.get(nums[i]) != null){
                ans++;
                System.out.println("+" + nums[i]);
            }
            m.remove(nums[i]);
        }
        
        return ans;
    }
}