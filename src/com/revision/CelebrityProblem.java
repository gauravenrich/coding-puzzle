package com.revision;

public class CelebrityProblem {
    public static void main(String[] args) {
        int[][] m = { { 0, 0, 1, 0 },
                { 0, 0, 1, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 1, 0 } };
        int index=celebrity(m,m.length);
        if(index==-1){
            System.out.println("Not Found");
        }else {
            System.out.println("Found at index "+index);
        }
    }

    public static int celebrity(int[][] M, int n){
        // This function returns the celebrity
        // index 0-based (if any)

        int i = 0, j = n - 1;
        while (i < j) {
            if (M[j][i] == 1) // j knows i
                j--;
            else // j doesn't know i, so I can't be celebrity
                i++;
        }
        // I point to our celebrity candidate
        int candidate = i;

        // Now, all that is left is to check that whether
        // the candidate is actually a celebrity i.e: he is
        // known by everyone, but he knows no one
        for (i = 0; i < n; i++) {
            if (i != candidate) {
                if (M[i][candidate] == 0
                        || M[candidate][i] == 1)
                    return -1;
            }
        }
        // if we reach here this means that the candidate
        // is really a celebrity
        return candidate;

    }
}
