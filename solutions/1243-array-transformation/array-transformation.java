class Solution {
    public List<Integer> transformArray(int[] arr) {
        int cnt = 1;
        int n = arr.length;
        while(cnt != 0){
            cnt = 0;
            int[] na = arr.clone();
            for(int i=1; i<arr.length-1; i++){
                if(na[i] > na[i-1] && na[i] > na[i+1]){
                    cnt++;
                    arr[i]--;
                }
                if(na[i] < na[i-1] && na[i] < na[i+1]){
                    cnt++;
                    arr[i]++;
                }
            }
        }
        ArrayList<Integer> newList = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            newList.add(arr[i]);
        }
        return newList;
        
    }
}