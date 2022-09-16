package com.blind75.bits;

/**
 * Given two integers a and b, return the sum of the two integers without using the operators + and -.
 */
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        System.out.println(sumNumbers(3, 5));
    }

    private static int sumNumbers(int a, int b) {
        int carry;
        while (b != 0) {
            carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
