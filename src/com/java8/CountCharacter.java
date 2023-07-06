package com.java8;

import java.util.Set;
import java.util.TreeSet;

public class CountCharacter {
    public static void main(String[] args) {
        String str="I am a java Developer";
        Set<Character> charSet=new TreeSet<>();
        for(char c:str.toCharArray()){
            charSet.add(c);
        }
        for(char c:charSet){
           long count=str.chars().filter(a->a==c).count();
            System.out.println(c+" occurs "+count+" times");
        }

    }
}
