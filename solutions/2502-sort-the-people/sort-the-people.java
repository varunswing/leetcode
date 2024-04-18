class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        List<Pair<Integer, String>> a = new ArrayList();
        
        for(int i=0; i<names.length; i++){
            a.add(new Pair(heights[i], names[i]));
        }
        
        Collections.sort(a, (x, y) -> y.getKey() - x.getKey());
        
        for(int i=0; i<names.length; i++){
            names[i] = a.get(i).getValue();
        }
        
        return names;
    }
}