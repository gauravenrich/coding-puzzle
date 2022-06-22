package com.puzzle.bit;

/**
 * Find position of set bit
 * 2 is represented as "10" in Binary.
 * As we see there's only one set bit
 * and it's in Position 2 and thus the
 * Output 2.
 */
public class FindOnlySetBitPosition {
    public static void main(String[] args) {
        System.out.println(findPosition(5));
    }
    static int findPosition(int n) {
        int count=0;
        if(n==0)
            return -1;
        for(int i=0;i<32;i++){
            if((n&1)!=0){
                if(count>0)
                    return -1;
                count=i+1;
            }
            n=n>>1;
        }

        return count;
    }
}
