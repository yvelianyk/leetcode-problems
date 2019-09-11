package com.company;

import com.company.ImplementTrie208.Trie;

public class Main {

    public static void main(String[] args) {
        Trie obj = new Trie();
        obj.insert("apple");
        obj.search("apple");   // returns true
        obj.search("app");     // returns false
        obj.startsWith("app"); // returns true
    }
}
