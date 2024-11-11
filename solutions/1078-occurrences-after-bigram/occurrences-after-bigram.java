class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] a = text.split(" ");
        List<String> s = new ArrayList<>();
        for(int i=1; i<a.length-1; i++){
            if(a[i].equals(second) && a[i-1].equals(first)){
                s.add(a[i+1]);
            }
        }
        return s.toArray(new String[0]);
    }
}