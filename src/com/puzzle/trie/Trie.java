package com.puzzle.trie;

/**
 * Date 03/20/2020
 * @author gauravenrich
 * Trie Class
 */
public class Trie {
    TrieNode root;

    public Trie(){
        root=new TrieNode();
    }
    public void insert(String key){
        int level=key.length();
        TrieNode pCrawl=root;
        int index;
        for(int i=0;i<level;i++){
            index=key.charAt(i)-'a';
            if(pCrawl.trieNodes[index]==null){
                pCrawl.trieNodes[index]=new TrieNode();
            }
            pCrawl=pCrawl.trieNodes[index];
        }
        pCrawl.isEndOfWord=true;
    }
    public boolean search(String key){
        int level=key.length();
        TrieNode pCrawl=root;
        int index;
        for(int i=0;i<level;i++){
            index=key.charAt(i)-'a';
            if(pCrawl.trieNodes[index]==null){
                return false;
            }
            pCrawl=pCrawl.trieNodes[index];
        }
        return pCrawl!=null && pCrawl.isEndOfWord;
    }
}
