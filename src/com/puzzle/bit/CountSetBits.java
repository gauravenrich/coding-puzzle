package com.puzzle.bit;

/**
 * @author gsinha
 * Count set bits
 */
public class CountSetBits {
    public static void main(String[] args) {
        System.out.println(setBits(10));
    }
    static int setBits(int n) {
        int count=0;
        while (n>0){
            count+=n&1;
            n=n>>1;
        }
        return count;
    }
}
