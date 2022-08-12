package com.puzzle.sortandsearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Print all subarrays with 0 sum
 *
 * @author gsinha
 * 11 aug 2022
 */

class Pair {
    int first, second;

    Pair(int a, int b) {
        first = a;
        second = b;
    }
}

public class PrintAllSubArrayZeroSum {
    public static void main(String[] args) {
        int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        int n = arr.length;
        List<Pair> out = findSubArrays(arr, n);
        if (out.size() == 0)
            System.out.println("No subarray exists");
        else
            print(out);
    }

    private static List<Pair> findSubArrays(int[] arr, int n) {
        // create an empty map
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<Pair> out = new ArrayList<>();

        // Maintains sum of elements so far
        int sum = 0;

        for (int i = 0; i < n; i++) {
            // add current element to sum
            sum += arr[i];

            // if sum is 0, we found a subarray starting
            // from index 0 and ending at index i
            if (sum == 0)
                out.add(new Pair(0, i));
            ArrayList<Integer> al = new ArrayList<>();

            // If sum already exists in the map there exists
            // at-least one subarray ending at index i with
            // 0 sum
            if (map.containsKey(sum)) {
                // map[sum] stores starting index of all subarrays
                al = map.get(sum);
                for (Integer integer : al) {
                    out.add(new Pair(integer + 1, i));
                }
            }
            al.add(i);
            map.put(sum, al);
        }
        return out;

    }

    static void print(List<Pair> out) {
        for (Pair p : out) {
            System.out.println("Subarray found from Index "
                    + p.first + " to " + p.second);
        }
    }
}
