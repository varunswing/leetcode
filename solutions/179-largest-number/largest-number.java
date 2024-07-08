class Solution {
    public String largestNumber(int[] nums) {
        
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        
        Comparator<Integer> customComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String a = o1.toString();
                String b = o2.toString();
                return (b+a).compareTo(a+b);
            }
        };
        
        Arrays.sort(arr, customComparator);
        
        String ans = "";
        for(int i=0; i<arr.length; i++){
            ans += arr[i].toString();
        }
        if(arr[0] == 0){
            return "0";
        }
        return ans;
    }
}