package com.puzzle.array;

public class MissingAndRepeatingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5};
        getMissingAndRepeating(arr, 6);
    }

    public static void getMissingAndRepeating(int[] arr,int n) {
        int xors = 0;
        int i;
        int x = 0;
        int y = 0;
        // XOR of all elements in the array
        for(i=0; i<n; i++)
            xors = xors ^ arr[i];
        // XOR of numbers from 1 to n (with xor)
        for(i=1; i<=n; i++)
            xors = xors ^ i;
        // Number with the same bit set as the rightmost set bit in xor
        int setBitNum = xors & -xors; // xor1 & ~(xor1 - 1);
        // Dividing the numbers in two sets and also getting the XORs
        for(i = 0; i < n; i++)
        {
            if((arr[i] & setBitNum)==1)
                x = x ^ arr[i];  // arr[i] belongs to Set A
            else
                y = y ^ arr[i];  // arr[i] belongs to Set B
        }
        for(i = 1; i <= n; i++)
        {
            if((i & setBitNum)==1)
                x = x ^ i;  // arr[i] belongs to Set A
            else
                y = y ^ i;  // arr[i] belongs to Set B
        }
        System.out.println("Repeating Number : "+x+"  Missing Number : "+y);

    }



}
