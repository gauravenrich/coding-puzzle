package com.puzzle.array;

/**
 *  Date 11/13/2020
 *  @author gauravenrich
 *
 */
public class LeadersInArray {

   public static void  main(String args[]){
       int[] input = { 98, 23, 54, 12, 20, 7, 27 };
       printLeaders(input);
   }

    private static void printLeaders(int[] input) {
       if(input==null)
           return;
       int n=input.length;
       int max=Integer.MIN_VALUE;
       for(int i=n-1;i>=0;i--){
           if(input[i]>max){
               System.out.print(input[i]+" ");
               max=input[i];
           }
       }
    }

}
