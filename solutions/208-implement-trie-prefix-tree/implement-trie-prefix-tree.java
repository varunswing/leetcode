class Node{
    Node[] node = new Node[26];
    boolean isWord = false;
}

class Trie {
    Node root;
    
    public Trie() {
        root = new Node();
    }
    
    public void insert(String word) {
        Node temp = root;
        for(char c : word.toCharArray()){
            if(temp.node[c - 'a'] == null){
                temp.node[c - 'a'] = new Node();
            }
            temp = temp.node[c-'a'];
        }
        temp.isWord = true;
    }
    
    public boolean search(String word) {
        Node temp = root;
        for(char c : word.toCharArray()){
            if(temp.node[c - 'a'] == null){
                return false;
            }
            temp = temp.node[c-'a'];
        }
        return temp.isWord;
    }
    
    public boolean startsWith(String prefix) {
        Node temp = root;
        for(char c : prefix.toCharArray()){
            if(temp.node[c - 'a'] == null){
                return false;
            }
            temp = temp.node[c-'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */