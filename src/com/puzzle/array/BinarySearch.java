package com.puzzle.array;

/**
 *  Date 11/13/2020
 *  @author gauravenrich
 */

public class BinarySearch {
    public static void main(String args[]){
        int array[] = { 21, 32, 43, 74, 75, 86, 97, 108, 149 };
        int num = 97;
        int index = findElementBinarySearch(array, num);
        System.out.println("Element " + num + (index >= 0 ? (" found at index " + index) : " not found!"));
    }

    private static int findElementBinarySearch(int[] array, int num) {
        int start=0;
        int end=array.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(array[mid]==num){
                return mid;
            }
            else if(array[mid]>num){
                end=mid-1;
            }
            else if(array[mid]<num){
                start=mid+1;
            }
        }
        return -1;
    }
}
