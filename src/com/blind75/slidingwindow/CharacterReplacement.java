package com.blind75.slidingwindow;

/**
 * Return the length of the longest substring containing the same letter you can get
 * after performing the above operations.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "ABAB", k = 2
 * Output: 4
 * Explanation: Replace the two 'A's with two 'B's or vice versa.
 */
public class CharacterReplacement {
    public static void main(String[] args) {
        String s = "ABAB";
        System.out.println(characterReplacement(s, 2));
    }

    public static int characterReplacement(String s, int k) {
        int left = 0;
        int max = 0;
        int[] count = new int[26];
        int maxChar = 0;
        for (int right = 0; right < s.length(); right++) {
            int c = s.charAt(right);
            int windowSize = right - left + 1;
            maxChar = Integer.max(maxChar, ++count[c-'A']);
            int replaceCount = windowSize - maxChar;
            if (replaceCount > k) {
                --count[s.charAt(left++) - 'A'];
            } else {
                max = Integer.max(max, windowSize);
            }
        }
        return max;
    }
}
