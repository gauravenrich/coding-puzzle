package com.puzzle.trie;

/**
 * Date 03/20/2020
 * @author gauravenrich
 * Trie Node
 */
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
