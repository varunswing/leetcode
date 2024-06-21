class Node{
    int key;
    int value;
    public Node(int key, int value){
        this.key = key;
        this.value = value;
    }
}

class LRUCache {
    

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public Map<Integer, Node> m = new HashMap();
    public Set<Node> cache = new LinkedHashSet();
    public int capacity;
    
    
    public int get(int key) {
        if(m.containsKey(key)){
            Node node = m.get(key);
            cache.remove(node);
            cache.add(node);
            return node.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(m.containsKey(key)){
            m.get(key).value = value;
            get(key);
            return;
        }
        if (cache.size() == capacity) {
          Node lastNode = cache.iterator().next();
          cache.remove(lastNode);
          m.remove(lastNode.key);
        }

        Node node = new Node(key, value);
        cache.add(node);
        m.put(key, node);
        
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */