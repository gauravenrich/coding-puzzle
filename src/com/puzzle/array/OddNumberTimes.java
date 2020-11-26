package com.puzzle.array;

/**
 *  Date 11/27/2020
 *  @author gauravenrich
 *  Odd Number of times occurance
 */

public class OddNumberTimes {

    public static void main(String[] args) {
        int[] input = {2, 3, 4, 3, 1, 4, 5, 1, 4, 2, 5};
        printNumberOccuringOddNumberOfTimes(input);
    }

    private static void printNumberOccuringOddNumberOfTimes(int[] input) {
        if(input==null)
            return;
        int res = input[0];
        for (int i = 1; i < input.length; i++) {
            res = res ^ input[i];
        }
        System.out.println(res);
    }
}
