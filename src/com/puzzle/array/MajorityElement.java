package com.puzzle.array;

/**
 *  Date 11/23/2020
 *  @author gauravenrich
 *  Majority Element
 */

import java.util.Arrays;

public class MajorityElement {

    public static void main(String[] args) {
        int[] array = {2, 6, 2, 2, 6, 2, 2, 8, 1};
        System.out.println(Arrays.toString(array) + " \nMajority Element: " + getMajorityElement(array));

    }

    private static Integer getMajorityElement(int[] array) {
        if (array == null || array.length == 0)
            return null;
        Integer candidate = null;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (count == 0) {
                candidate = array[i];
                count=1;
            } else {
                if (array[i] == candidate) {
                    count++;
                } else
                    count--;
            }
        }
        if (count == 0) {
            return null;
        }
        count = 0;
        for (Integer num:array) {
            if (candidate.equals(num)) {
                count++;
            }
        }
        return (count >= (array.length / 2))?candidate:null;

    }
}
