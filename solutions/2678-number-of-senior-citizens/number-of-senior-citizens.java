class Solution {
    public int countSeniors(String[] details) {
        return (int) Arrays.stream(details).filter(a -> Integer.valueOf(a.substring(11, 13)) > 60).count();
    }
}