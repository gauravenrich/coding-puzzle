package com.puzzle.bit;

/**
 *  Date 03/24/2021
 *  @author gauravenrich
 *  Flip Bit To Convert another number
 */

public class FlipBitToConvert {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.print(FlippedCount(a, b));
    }

    private static int FlippedCount(int a, int b) {
        return countSetBits(a^b);
    }

    private static int countSetBits(int n) {
        int count=0;
        while (n>0){
            count+=n&1;
            n=n>>1;
        }
        return count;
    }

}
