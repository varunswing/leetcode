class Solution {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        int n = Math.max(Math.max(arr1[arr1.length - 1], arr2[arr2.length - 1]), arr3[arr3.length-1]);

        List<Integer> ans = new ArrayList<>();

        int[] arr = new int[n+1];

        for(int i=0; i<arr1.length; i++){
            arr[arr1[i]]++;
        }
        for(int i=0; i<arr2.length; i++){
            arr[arr2[i]]++;
        }
        for(int i=0; i<arr3.length; i++){
            arr[arr3[i]]++;
            if(arr[arr3[i]] == 3){
                ans.add(arr3[i]);
            }
        }
        return ans;
    }
}