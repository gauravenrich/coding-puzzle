package com.blind75.bits;

public class ReverseBits {
    public static void main(String[] args) {
        System.out.println(reverseBits(1));
    }

    public static int reverseBits(int n) {
        if(n==0) return 0;
        int result=0;
        for(int i=0;i<32;i++){
            result <<=1; //shift left by 1bit
            if((n&1)==1) result++;
            n>>=1;
        }
        return result;
    }
}
