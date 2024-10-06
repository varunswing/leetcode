class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] arr = new int[3];

        for(int i=0; i<bills.length; i++){
            if(bills[i] == 5){
                arr[0]++;
            }

            if(bills[i] == 10){
                if(arr[0] == 0){
                    return false;
                }
                arr[1]++;
                arr[0]--;
            }

            if(bills[i] == 20){
                arr[2]++;
                if(arr[0] == 0){
                    return false;
                }
                if(arr[1] == 0 && arr[0] < 3){
                    return false;
                }

                if(arr[1] == 0){
                    arr[0] = arr[0] - 3;
                }else if(arr[1] >= 1){
                    arr[1]--;
                    arr[0]--;
                }
            }
        }

        return true;
    }
}