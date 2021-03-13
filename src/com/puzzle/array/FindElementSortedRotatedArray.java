package com.puzzle.array;

public class FindElementSortedRotatedArray {

    public static void main(String[] args){
        int[] array = {21, 27, 34, 47, 54, 66};
        int index = findElement(array);
        System.out.println("Index is "+index);

    }

    private static int findElement(int[] array) {
        int pivot=findPivot(array);
        return -1;
        
    }

    private static int findPivot(int[] array) {
        return -1;
    }
}
