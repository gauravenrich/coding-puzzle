package com.puzzle.sortandsearch;

/**
 *  * Date 23/06/2022
 *  * @author gauravenrich
 *  * Common Element in 3 Sorted Array
 */
public class CommonElementSortedArray {
    public static void main(String[] args) {
        CommonElementSortedArray ob = new CommonElementSortedArray();

        int[] ar1 = {1, 5, 10, 20, 40, 80};
        int[] ar2 = {6, 7, 20, 80, 100};
        int[] ar3 = {3, 4, 15, 20, 30, 70, 80, 120};

        System.out.print("Common elements are ");
        ob.findCommon(ar1, ar2, ar3);
    }

    private void findCommon(int[] ar1, int[] ar2, int[] ar3) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < ar1.length && j < ar2.length && k < ar3.length) {
            if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
                System.out.print(ar1[i] + " ");
                i++;
                j++;
                k++;
            } else if (ar1[i] < ar2[j]) {
                i++;
            } else if (ar2[j] < ar3[k]) {
                j++;
            } else {
                k++;
            }
        }
    }
}
