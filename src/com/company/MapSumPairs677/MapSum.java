package com.company.MapSumPairs677;

import java.util.HashMap;
import java.util.Map;

public class MapSum {

    TrieNode root;

    public MapSum() {
        root = new TrieNode();
    }

    public void insert(String key, int val) {
        char[] chars = key.toCharArray();
        TrieNode node = root;
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (node.get(aChar) == null) {
                node.put(aChar, new TrieNode());
            }

            node = node.get(aChar);
        }
        node.setValue(val);
    }

    public int sum(String prefix) {
        TrieNode target = searchPrefix(prefix);
        if(target == null) return 0;
        return getSum(target);
    }

    private int getSum(TrieNode node) {
        if(node == null) return 0;
        Map<Character, TrieNode> children = node.children;
        int res = node.getValue();
        for (Map.Entry<Character, TrieNode> entry : children.entrySet()) {
            int val = getSum(entry.getValue());
            res = res + val;
        }
        return res;
    }

    private TrieNode searchPrefix(String prefix) {
        char[] chars = prefix.toCharArray();
        TrieNode node = root;
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if(node.get(aChar) == null) return null;
            node = node.get(aChar);
        }
        return node;
    }
}

class TrieNode {
    public Map<Character, TrieNode> children;
    private int value;

    public TrieNode () {
        children = new HashMap<>();
    }

    public void setValue(int val) {
        value = val;
    }

    public int getValue() {
        return value;
    }

    public TrieNode get(char ch) {
        return children.get(ch);
    }

    public void put(char ch, TrieNode node) {
        children.put(ch, node);
    }

}