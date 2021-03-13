package com.puzzle.array;

/**
 *  Date 03/13/2020
 *  @author gauravenrich
 *  Move all negative numbers to beginning and positive to end with constant extra space
 */
public class MoveNegativeNumbers {
    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5,
                6, -7, 5, -3, 11};
        int arr_size = arr.length;
        // Function Call
        shiftAll(arr, 0, arr_size - 1);

        for(int i = 0; i < arr_size; ++i)
            System.out.print(arr[i] + " ");
    }

    private static void shiftAll(int[] arr, int start, int end) {
        int i=start;
        int j=end;
        while (i<=j){
            if(arr[i]<0 && arr[j]<0){
                i++;
            }
            else if(arr[i]>0 && arr[j]<0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }else if(arr[i]>0 && arr[j]>0){
                j--;
            }else {
                i++;
                j--;
            }
        }
    }
}
