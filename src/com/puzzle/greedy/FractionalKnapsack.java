package com.puzzle.greedy;

import java.util.Arrays;

/**
 * Input:
 * Items as (value, weight) pairs
 * arr[] = {{60, 10}, {100, 20}, {120, 30}}
 * Knapsack Capacity, W = 50;
 * <p>
 * Output:
 * Maximum possible value = 240
 * by taking items of weight 10 and 20 kg and 2/3 fraction
 * of 30 kg. Hence total price will be 60+100+(2/3)(120) = 240
 */

// item value class
class ItemValue {
    Double cost;
    double wt, val, ind;

    // item value function
    public ItemValue(int wt, int val, int ind) {
        this.wt = wt;
        this.val = val;
        this.ind = ind;
        cost = (double) val / (double) wt;
    }
}

public class FractionalKnapsack {
    public static void main(String[] args) {
        int[] wt = {10, 40, 20, 30};
        int[] val = {60, 40, 100, 120};
        int capacity = 50;

        double maxValue = getMaxValue(wt, val, capacity);

        // Function call
        System.out.println("Maximum value we can obtain = "
                + maxValue);
    }

    private static double getMaxValue(int[] wt, int[] val, int capacity) {
        ItemValue[] iVal = new ItemValue[wt.length];

        for (int i = 0; i < wt.length; i++) {
            iVal[i] = new ItemValue(wt[i], val[i], i);
        }

        // sorting items by value;
        Arrays.sort(iVal, (o1, o2) -> o2.cost.compareTo(o1.cost));

        double totalValue = 0d;

        for (ItemValue i : iVal) {

            int curWt = (int) i.wt;
            int curVal = (int) i.val;

            if (capacity - curWt >= 0) {
                // this weight can be picked while
                capacity = capacity - curWt;
                totalValue += curVal;
            } else {
                // item cant be picked whole
                double fraction
                        = ((double) capacity / (double) curWt);
                totalValue += (curVal * fraction);
                break;
            }
        }

        return totalValue;
    }


}
