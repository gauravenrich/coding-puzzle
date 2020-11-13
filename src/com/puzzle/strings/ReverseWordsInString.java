package com.puzzle.strings;

import java.util.Scanner;

public class ReverseWordsInString {

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String input=s.nextLine();
        System.out.println(revWords(input.toCharArray()));
        s.close();

    }

    private static String  revWords(char[] input) {
        int start=0;
        for(int i=0;i<input.length;i++){
            char c=input[i];
            if(c==' ' && i>0){
                reverse(input,start,i-1);
                start=i+1;
            }
            else if(i==input.length-1){
                reverse(input,start,i);
            }
        }
        reverse(input,0,input.length-1);
        return new String(input);
    }

    public static  void reverse(char[] a,int start,int end){
        while(start<=end){
            char temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
}
