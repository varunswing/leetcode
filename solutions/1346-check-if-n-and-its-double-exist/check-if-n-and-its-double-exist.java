class Solution {
    public boolean checkIfExist(int[] arr) {
        Map<Integer, Boolean> m = new HashMap();

        for(int i=0; i<arr.length; i++){
            if(m.get(arr[i]*2) != null){
                return true;
            }
            if(arr[i]%2 == 0 && m.get(arr[i]/2) != null){
                return true;
            }
            m.put(arr[i], true);
        }
        return false;
    }
}