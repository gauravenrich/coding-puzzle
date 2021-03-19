package com.puzzle.strings;

/**
 * Date 03/19/2020
 * @author gauravenrich
 * Check if a string is a valid shuffle of two distinct strings
 */
public class ValidShuffleString {

    public static void main(String[] args) {
        String first = "XY";
        String second = "12";
        String[] results = {"1XY2", "Y12X"};

        // call the method to check if result string is
        // shuffle of the string first and second
        for (String result : results) {
            if (shuffleCheck(first, second, result) == true) {
                System.out.println(result + " is a valid shuffle of " + first + " and " + second);
            } else {
                System.out.println(result + " is not a valid shuffle of " + first + " and " + second);
            }
        }
    }

    private static boolean shuffleCheck(String first, String second, String result) {
        int i = 0, j = 0, k = 0;
        int m = first.length();
        int n = second.length();
        int r = result.length();
        if (m + n != r) {
            return false;
        }
        while (k < r) {
            if (i < m && first.charAt(i) == result.charAt(k)) {
                i++;
            } else if (j < n && second.charAt(j) == result.charAt(k)) {
                j++;
            } else {
                return false;
            }
            k++;
        }
        return i >= m && j >= n;
    }
}
