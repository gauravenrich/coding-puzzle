package com.puzzle.strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  Date 11/13/2020
 *  @author gauravenrich
 *
 */

public class RemoveSpaces {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String input=s.nextLine();
        System.out.println(removeSpace(input.toCharArray()));
        s.close();
    }

    private static String removeSpace(char[] input) {
        int spaces=0;
        for(int i=0;i<input.length;i++){
            char c=input[i];
            if(c==' '){
                spaces++;
            }
            else {
                input[i - spaces] = input[i];
            }
        }
        return new String(Arrays.copyOf(input,input.length-spaces));
    }

}
