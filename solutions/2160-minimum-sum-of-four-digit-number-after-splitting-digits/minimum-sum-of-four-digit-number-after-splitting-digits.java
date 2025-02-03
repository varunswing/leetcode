class Solution {
    public int minimumSum(int num) {
        String s = String.valueOf(num);
        char[] a = s.toCharArray();
        Arrays.sort(a);

        int n1 = (((a[0]-'0') * 10) + a[2]-'0') + (((a[1]-'0') * 10) + a[3]-'0');
        return n1;

    }
}