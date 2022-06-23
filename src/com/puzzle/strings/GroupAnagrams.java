package com.puzzle.strings;

import java.util.*;

/**
 * * Date 23/06/2022
 *  * @author gsinha
 *  * Leetcode 49. Group Anagrams
 */
public class GroupAnagrams {

    public static void main(String[] args) {
        String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        List<List<String>> result = groupAnagrams.groupAnagrams(strings);
        System.out.println(result);
    }

    public List<List<String>> groupAnagrams(String[] strings) {
        List<List<String>> result;
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strings) {
            char[] cur = str.toCharArray();
            Arrays.sort(cur);
            String sorted = new String(cur);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }
        result = new ArrayList<>(map.values());
        return result;
    }
}
