class Solution {
    public List<Integer> transformArray(int[] arr) {
        int cnt = 1;
        int n = arr.length;
        while(cnt != 0){
            cnt = 0;
            int[] na = Arrays.copyOf(arr, n);
            for(int i=1; i<arr.length-1; i++){
                if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                    cnt++;
                    na[i]--;
                }
                if(arr[i] < arr[i-1] && arr[i] < arr[i+1]){
                    cnt++;
                    na[i]++;
                }
            }
            arr = Arrays.copyOf(na, n);
        }
        ArrayList<Integer> newList = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            newList.add(arr[i]);
        }
        return newList;
        
    }
}