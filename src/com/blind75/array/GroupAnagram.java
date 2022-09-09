package com.blind75.array;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        GroupAnagram groupAnagram = new GroupAnagram();
        System.out.println(groupAnagram.groupAnagrams(strs));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list;
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] a = str.toCharArray();
            Arrays.sort(a);
            String sorted = new String(a);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }
        list = new ArrayList<>(map.values());
        return list;
    }
}
