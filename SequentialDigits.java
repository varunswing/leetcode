class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String n = "123456789";
        int ld = Integer.toString(low).length();
        int hd = Integer.toString(high).length();;
        int count = 1;
        List<Integer> ans = new ArrayList<>();
        for(int i=ld; i<=hd; i++){
            for(int j=0; j<10-i; j++){
                int num = Integer.valueOf(n.substring(j, j+i));
                if(num >= low && num <= high) ans.add(num);
            }
        }
        return ans;
    }
}
