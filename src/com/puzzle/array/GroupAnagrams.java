package com.puzzle.array;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] list={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(list));

    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char[] word=str.toCharArray();
            Arrays.sort(word);
            String sorted=new String(word);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
