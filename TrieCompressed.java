public class TrieCompressed {
    private TrieNode root;
    TrieCompressed() {
    root = new TrieNode();
    }
    
    public void insert(String word) {
    TrieNode currentNode = root;
        for (char ch : word.toCharArray()) {
         TrieNode child = getChild(currentNode, ch);
            if (child == null) {
                child = new TrieNode();
                currentNode.children.add(child);
                }
                currentNode = child;
            }
            currentNode.isWord = true;
        }
    
        public boolean isCompoundWord(String word) {
         TrieNode currentNode = root;
           for (char ch : word.toCharArray()) {
             TrieNode child = getChild(currentNode, ch);
             if (child == null) 
                return false;
             
             currentNode = child;
             if (currentNode.isWord) 
                return true;
            }
            return false;
        }
    
     private TrieNode getChild(TrieNode node, char ch) {
        for (TrieNode child : node.children) {
        //  'ch' is a character in ASCII range [a-z]
            if (ch == (char) (child.hashCode() + 'a')) 
                return child;
            
            }
            return null;
        }
    
        public String getLongestCompoundWord() {
            throw new UnsupportedOperationException("Unimplemented method 'getLongestCompoundWord'");
        }
}

