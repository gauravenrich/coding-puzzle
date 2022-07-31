package com.puzzle.bit;

import java.util.Arrays;

/**
 * @author gsinha
 *
 * arr[] = {1, 2, 3, 2, 1, 4}
 * Output:
 * 3 4
 * Explanation:
 * 3 and 4 occur exactly once.
 *
 *  31 july 2022
 */
public class NonRepeatingNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4};
        NonRepeatingNumbers obj = new NonRepeatingNumbers();
        System.out.println(Arrays.toString(obj.singleNumber(arr)));
    }

    public int[] singleNumber(int[] nums) {
        int result = 0;
        int first = 0;
        int second = 0;
        int[] res = new int[2];

        for (int e : nums) {
            result = result ^ e;
        }

        int rightBit = result & ~(result - 1);
        /*
         e.g 7 & ~(6)= 111 & 001 = 001
         ~(110)=001
         */
        System.out.println(rightBit);
        for (int num : nums) {
            int cur = num & rightBit;
            if (cur == 1) {
                first = first ^ num;  // collect all numbers with 1 in the end
            } else {
                second = second ^ num; // collect all numbers with 0 in the end
            }
        }

        res[0] = first;
        res[1] = second;
        return res;
    }
}
