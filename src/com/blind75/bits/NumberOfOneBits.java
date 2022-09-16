package com.blind75.bits;

public class NumberOfOneBits {
    public static void main(String[] args) {
        int n = 00000000000000000000000000001011;
        System.out.println(countOneBits(n));
    }

    private static int countOneBits(int n) {
        int count=0;
        int match=1;
        for(int i=0;i<31;i++){
            if((n&match)!=0){
                count++;
            }
            match=match<<1;
        }
        return count;
    }
}
