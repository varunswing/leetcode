class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        int md = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++){
            if(Math.abs(arr[i] - arr[i+1]) < md){
                md = Math.abs(arr[i] - arr[i+1]);
            }
        }

        for(int i=0; i<arr.length-1; i++){
            if(Math.abs(arr[i] - arr[i+1]) == md){
                List<Integer> res = new ArrayList();
                res.add(arr[i]);
                res.add(arr[i+1]);
                ans.add(res);
            }
        }

        return ans;
    }
}