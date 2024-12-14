class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet();

        int n = nums.length;

        for(int i=0; i<nums.length; i++){
            st.add(nums[i]);
        }

        List<Integer> na = new ArrayList<>(); 

        for(int i=0; i<nums.length; i++){
            if(!st.contains(nums[i] - 1)){
                na.add(nums[i]);
            }
        }

        int ans = 1;
        int res = 0;

        for(int i=0; i<na.size(); i++){
            int a = na.get(i)+1;
            while(st.contains(a)){
                ans++;
                a++;
            }
            res = Math.max(ans, res);
            ans = 1;
        }
        return res;
    }
}