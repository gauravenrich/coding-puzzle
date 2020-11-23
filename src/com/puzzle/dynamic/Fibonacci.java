package com.puzzle.dynamic;

import java.util.Scanner;

/**
 *  Date 11/23/2020
 *  @author gauravenrich
 *  Fibonacci DP
 */

public class Fibonacci {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(fibo(n));
        s.close();

    }

    public static int fibo(int n){
        int[] f=new int[n+2];
        f[0]=0;
        f[1]=1;
        for(int i=2;i<=n;i++){
            f[i]=f[i-1]+f[i-2];
        }
        return f[n];
    }
}
