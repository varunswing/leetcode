class LRUCache
{
    private class Node{
        int key;
        int val;
        Node prev, next;
        
        Node(int key, int val){
            this.key = key;
            this.val = val;
        }
    
    }
    
    public LRUCache(int capacity){
        this.capacity = capacity;
        this.cache = new HashMap();
        
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }
    
    private HashMap<Integer, Node> cache;
    
    private Node head;
    
    private Node tail;
    
    private int capacity;
    
    public int get(int key){
        if(!cache.containsKey(key)){
            return -1;
        }
        Node node = cache.get(key);
        
        node.prev.next = node.next;
        node.next.prev = node.prev;
        
        insert(node);
        return node.val;
    }
    
    public void put(int key, int val){
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            node.val = val;
            node.prev.next = node.next;
            node.next.prev = node.prev;
            
            insert(node);
        }else{
            if(cache.size() == capacity){
                cache.remove(tail.prev.key); //LRU
                
                tail.prev.prev.next = tail.prev.next;
                tail.prev.next.prev = tail.prev.prev;
            }
            
            Node n = new Node(key, val);
            cache.put(key, n);
            insert(n);
        
            
        }
    }
    
    private void insert(Node node){
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */