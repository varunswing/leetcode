class RandomizedSet {

    private List<Integer> a = new ArrayList<>();
    private Random rand = new Random();
    private Map<Integer, Integer> m = new HashMap<>();

    public RandomizedSet() {
        
    }
    
    public boolean insert(int val) {
        if(m.containsKey(val)){
            return false;
        }
        a.add(val);
        m.put(val, a.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        if(!m.containsKey(val)){
            return false;
        }
        int i = m.get(val);
        m.put(a.get(a.size() - 1), i);
        m.remove(val);
        a.set(i, a.get(a.size() - 1));
        a.remove(a.size() - 1);
        return true;
        
    }
    
    public int getRandom() {
        int i = rand.nextInt(a.size());
        return a.get(i);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */