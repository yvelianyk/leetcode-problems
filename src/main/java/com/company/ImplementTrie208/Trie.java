package com.company.ImplementTrie208;

public class Trie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        char[] chars = word.toCharArray();
        TrieNode node = root;
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (!node.containsKey(aChar)) {
                node.put(aChar, new TrieNode());
            }
            node = node.get(aChar);
        }

        node.setEnd();
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode prefix = searchPrefix(word);
        return prefix != null && prefix.isEnd();
    }

    public boolean startsWith(String prefix) {
        TrieNode foundPrefix = searchPrefix(prefix);
        return foundPrefix != null;
    }

    private TrieNode searchPrefix(String word) {
        char[] chars = word.toCharArray();
        TrieNode node = root;
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if(!node.containsKey(aChar)) return null;
            node = node.get(aChar);
        }
        return node;
    }
}

class TrieNode {
    private final int CHILD_NUMBER = 26;
    private TrieNode[] children;
    private boolean isEnd;

    public TrieNode() {
        children = new TrieNode[CHILD_NUMBER];
    }

    public void setEnd() {
        isEnd = true;
    }

    public boolean isEnd() {
        return isEnd;
    }

    public boolean containsKey(char ch) {
        return children[ch - 'a'] != null;
    }

    public void put(char ch, TrieNode node) {
        children[ch - 'a'] = node;
    }

    public TrieNode get(char ch) {
        return children[ch - 'a'];
    }
}