package com.puzzle.array;

/**
 *  Date 11/14/2020
 *  @author gauravenrich
 */

public class IndexOfLastElement {
    public static void main(String args[]){
        int[] array = {0, 1, 2, 2, 4, 5, 5, 5, 8};
        int num = 8;
        int index = searchElementAndReturnIndex(array, num);
        System.out.println("Element " + num + (index >= 0 ? (" found at index " + index) : " not found!"));
    }

    private static int searchElementAndReturnIndex(int[] array, int num) {
        int start=0;
        int end=array.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(array[mid]==num && ( (mid==array.length-1) || array[mid+1]>num ) ){
                return mid;
            }
            else if (num>=array[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return -1;
    }
}
