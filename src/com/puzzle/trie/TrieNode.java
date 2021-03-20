package com.puzzle.trie;

public class TrieNode {
    TrieNode[] trieNodes=new TrieNode[26];
    boolean isEndOfWord;

    public TrieNode(){
        isEndOfWord=false;
        for(int i=0;i<26;i++){
            trieNodes[i]=null;
        }
    }
}
