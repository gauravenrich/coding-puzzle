package com.puzzle.strings;

/**
 * Date 03/19/2020
 * @author gauravenrich
 * Print all the duplicates in the input string
 */
public class PrintDuplicateChars {
    public static void main(String[] args) {
        String str = "test string";
        printDup(str);
    }

    private static void printDup(String str) {
        int[] count=new int[256];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
        for(int i=0;i<256;i++){
            if(count[i]>1)
            System.out.print((char)i+" ");
        }
    }
}
