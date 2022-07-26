package com.puzzle.strings;

import java.util.HashSet;
import java.util.Set;

/**
 * Leet code 3. Longest Substring Without Repeating Characters
 * @author gsinha
 * 27th july 2022
 */
public class LongestSubsWithoutRepChars {
    public static void main(String[] args) {
        LongestSubsWithoutRepChars longestSubsWithoutRepChars = new LongestSubsWithoutRepChars();
        System.out.println(longestSubsWithoutRepChars.lengthOfLongestSubstring("abcabcbb"));
    }

    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int n = s.length();
        int len = 0;
        Set<Character> set = new HashSet<>();
        while (i < n && j < n) {
            char c = s.charAt(j);
            if (set.contains(c)) {
                set.remove(s.charAt(i++));
            } else {
                set.add(c);
                j++;
                len = Integer.max(len, j - i);
            }
        }
        return len;
    }
}
