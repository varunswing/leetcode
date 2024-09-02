class Solution {
    public int missingNumber(int[] arr) {
        int d = arr[1] - arr[0];
        if(d < 0){
            d = Math.max(arr[2] - arr[1], d);
        }else{
            d = Math.min(arr[2] - arr[1], d);
        }

        for(int i=0; i<arr.length -1; i++){
            if(arr[i] + d != arr[i+1]){
                return arr[i] + d;
            }
        }

        return arr[1];
    }
}