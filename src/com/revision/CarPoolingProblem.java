package com.revision;

public class CarPoolingProblem {
    public static void main(String[] args) {
        int[][] trips = {{2, 1, 5}, {3, 3, 7}};
        int capacity = 4;
        System.out.println(carPooling(trips, capacity));
    }

    public static boolean carPooling(int[][] trips, int capacity) {
        int maxDist = 0;
        for (int[] temp : trips) {
            maxDist = Math.max(maxDist, temp[2]);
        }
        int[] arr = new int[maxDist + 1];
        for (int[] temp : trips) {
            arr[temp[1]] += temp[0];//Adding number of passengers from source
            arr[temp[2]] -= temp[0];//Same number of passengers vacate the seats at destination
        }
        for (int p : arr) {
            capacity -= p;
            //If at any point of time, capacity becomes negative, it means we return false
            if (capacity < 0) {
                return false;
            }
        }
        return true;
    }
}
