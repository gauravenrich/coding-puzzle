package com.blind75.array;

public class IsAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        int[] a = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            a[c - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            a[c - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (a[i] != 0) {
                return false;
            }
        }
        return true;

    }
}
