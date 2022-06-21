package com.puzzle.strings;

/**
 *  Date 22/06/2022
 *  @author gauravenrich
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(str));
    }

    private static String longestCommonPrefix(String[] str) {
        String result = str[0];
        for (int i = 1; i < str.length; i++) {
            result = lcpUtil(str[i], result);
        }
        return result;
    }

    private static String lcpUtil(String s, String result) {
        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();
        while (i < s.length() && j < result.length()) {
            if (s.charAt(i) == result.charAt(j)) {
                sb.append(s.charAt(i));
                i++;
                j++;
            } else {
                break;
            }
        }
        return sb.toString();
    }
}
