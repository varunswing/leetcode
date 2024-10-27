class Trie {
    Node root;
    class Node {
        Node[] children;
        boolean isEnd;

        public Node() {
            children = new Node[26];
        }

        void insert(String word, int wordIndex) {
            if (wordIndex == word.length()) {
                isEnd = true;
                return;
            }
            int charIndex = word.charAt(wordIndex)-'a';
            if(children[charIndex] == null){
                children[charIndex] = new Node();
            }
            children[charIndex].insert(word, wordIndex+1);
        }

        boolean search(String word, int wordIndex) {
            if (wordIndex == word.length()) {
                return isEnd == true;
            }
            int charIndex = word.charAt(wordIndex)-'a';
            if(children[charIndex] == null){
                return false;
            }
            return children[charIndex].search(word, wordIndex+1);        
        }

        boolean startsWith(String word, int wordIndex) {
            if (wordIndex == word.length()) {
                return true;
            }
            int charIndex = word.charAt(wordIndex)-'a';
            if(children[charIndex] == null){
                return false;
            }
            return children[charIndex].startsWith(word, wordIndex+1);        
        }        
    }
    
    public Trie() {
        root = new Node();
    }
    
    public void insert(String word) {
        root.insert(word, 0);
    }
    
    public boolean search(String word) {
        return root.search(word, 0);
    }
    
    public boolean startsWith(String prefix) {
        return root.startsWith(prefix, 0);
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */