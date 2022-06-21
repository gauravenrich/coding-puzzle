package com.puzzle.strings;

/**
 * S = aabaa
 * Output:  aba
 */
public class RemoveConsecutiveChars {
    public static void main(String[] args) {
        String str = "aabaa";
        System.out.println(removeConsecutiveChar(str));
    }

    private static String removeConsecutiveChar(String str) {
        StringBuilder sb = new StringBuilder();
        char prev = str.charAt(0);
        sb.append(prev);
        for (int i = 1; i < str.length(); i++) {
            char current = str.charAt(i);
            if (prev != current) {
                sb.append(current);
                prev = current;
            }
        }
        return sb.toString();
    }
}
