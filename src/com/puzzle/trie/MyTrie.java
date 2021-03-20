package com.puzzle.trie;

public class MyTrie {

    public static void main(String[] args) {

        // Input keys (use only 'a' through 'z' and lower case)
        String keys[] = {"the", "a", "there", "answer", "any",
                "by", "bye", "their"};

        String output[] = {"Not present in trie", "Present in trie"};

        Trie trie = new Trie();

        // Construct trie
        int i;
        for (i = 0; i < keys.length; i++)
            trie.insert(keys[i]);

        // Search for different keys
        if (trie.search("the") == true)
            System.out.println("the --- " + output[1]);
        else System.out.println("the --- " + output[0]);

        if (trie.search("these") == true)
            System.out.println("these --- " + output[1]);
        else System.out.println("these --- " + output[0]);

        if (trie.search("their") == true)
            System.out.println("their --- " + output[1]);
        else System.out.println("their --- " + output[0]);

        if (trie.search("bye") == true)
            System.out.println("bye --- " + output[1]);
        else System.out.println("bye --- " + output[0]);

    }
}

