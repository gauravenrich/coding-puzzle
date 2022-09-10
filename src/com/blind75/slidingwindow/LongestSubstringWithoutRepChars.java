package com.blind75.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepChars {

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(longestSubsWithoutRepeat(s));
    }

    public static int longestSubsWithoutRepeat(String s) {
        Set<Character> set = new HashSet<>();
        int len = 0;
        int i = 0;
        int j = 0;
        int n = s.length();
        while (i < n && j < n) {
            char c = s.charAt(j);
            if (set.contains(c)) {
                set.remove(c);
                i++;
            } else {
                set.add(c);
                j++;
                len = Integer.max(len, j - i);
            }
        }
        return len;
    }
}
