package com.puzzle.array;

import java.util.PriorityQueue;

/**
 *  Date 08/03/2021
 *  @author gauravenrich
 * Longest Consecutive SubSequence
 */
public class LongestConsecutiveSubSequence {
    // return the length of the longest
    // subsequence of consecutive integers
    static int findLongestConseqSubseq(int[] arr, int N)
    {
        PriorityQueue<Integer> pq
                = new PriorityQueue<>();
        for (int i = 0; i < N; i++)
        {
            // adding element from
            // array to PriorityQueue
            pq.add(arr[i]);
        }
        // Storing the first element
        // of the Priority Queue
        // This first element is also
        // the smallest element
        int prev = pq.poll();

        // Taking a counter variable with value 1
        int c = 1;

        // Storing value of max as 1
        // as there will always be
        // one element
        int max = 1;

        for (int i = 1; i < N; i++)
        {
            // check if current peek
            // element minus previous
            // element is greater then
            // 1 This is done because
            // if it's greater than 1
            // then the sequence
            // doesn't start or is broken here
            if (pq.peek() - prev > 1)
            {
                // Store the value of counter to 1
                // As new sequence may begin
                c = 1;

                // Update the previous position with the
                // current peek And remove it
                prev = pq.poll();
            }

            // Check if the previous
            // element and peek are same
            else if (pq.peek() - prev == 0)
            {
                // Update the previous position with the
                // current peek And remove it
                prev = pq.poll();
            }
            // if the difference
            // between previous element and peek is 1
            else
            {
                // Update the counter
                // These are consecutive elements
                c++;

                // Update the previous position
                // with the current peek And remove it
                prev = pq.poll();
            }

            // Check if current longest
            // subsequence is the greatest
            if (max < c)
            {
                // Store the current subsequence count as
                // max
                max = c;
            }
        }

        return max;
    }

    // Driver Code
    public static void main(String[] args) {
        int[] arr = { 1, 9, 3, 10, 4, 20, 2 };
        int n = arr.length;
        System.out.println(
                "Length of the Longest consecutive subsequence is "
                        + findLongestConseqSubseq(arr, n));
    }
}
