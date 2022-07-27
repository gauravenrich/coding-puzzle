package com.puzzle.array;

/**
 *  Date 11/26/2020
 *  @author gauravenrich
 *  Bubble Sort
 */
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {12, 35, 87, 26, 9, 28, 7};
        bubbleSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    private static void bubbleSort(int[] array) {
        if(array==null || array.length==1)
            return;
        int n=array.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(array[j]>array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

    }
}
