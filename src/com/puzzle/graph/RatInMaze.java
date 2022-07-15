package com.puzzle.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Rat in a Maze problem
 * 15 july 2022
 */
public class RatInMaze {
    public static void main(String[] args) {
        int n = 4;
        int[][] m = {{1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}};
        List<String> result=findPath(m,n);
        System.out.println(result);
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> result=new ArrayList<>();
        if(m[0][0]==0 || m[n-1][n-1]==0){
            return result;
        }
        helper("",m,0,0,n,result);
        return result;
    }

    private static void helper(String path, int[][] m, int i, int j, int n,ArrayList<String> result) {
        if(i>=0 && j>=0 && i<n && j<n && m[i][j]==1){
            if(i==n-1 && j==n-1){
                result.add(path);
                return;
            }
            m[i][j]=0;
            helper(path+"D",m,i+1,j,n,result);
            helper(path+"U",m,i-1,j,n,result);
            helper(path+"R",m,i,j+1,n,result);
            helper(path+"L",m,i,j-1,n,result);
            m[i][j]=1;
        }
    }
}
