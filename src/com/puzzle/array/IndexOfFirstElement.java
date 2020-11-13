package com.puzzle.array;

/**
 *  Date 11/14/2020
 *  @author gauravenrich
 */


public class IndexOfFirstElement {

    public static void main(String args[]){
        int[] array = {0, 1, 2, 2, 4, 5, 5, 5, 8};
        int num = 5;
        int index = searchElementAndReturnIndex(array, num);
        System.out.println("Element " + num + (index >= 0 ? (" found at index " + index) : " not found!"));
    }

    private static int searchElementAndReturnIndex(int[] array, int num) {
        int start=0;
        int end=array.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            System.out.println("mid is "+mid);
            if(array[mid]==num && (mid==0 || array[mid-1]<num)){
                return mid;
            }
            else if(array[mid]>=num){
                end=mid-1;
            }
            else
                start=mid+1;

        }
        return -1;
    }
}
