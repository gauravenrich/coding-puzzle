package com.puzzle.graph;

public class FloodFill {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1, sc = 1, newColor = 2;
        FloodFill floodFill = new FloodFill();
        System.out.println("Before flood fill ");
        display(image);
        floodFill.floodFill(image, sr, sc, newColor);
        System.out.println("After flood fill ");
        display(image);
    }

    private static void display(int[][] image) {
        for(int i=0;i<image.length;i++){
            for (int j=0;j<image[0].length;j++){
                System.out.print(image[i][j]+" ");
            }
            System.out.println();
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor) {
            return image;
        }
        dfs(image, sr, sc, newColor, image[sr][sc]);
        return image;
    }

    public void dfs(int[][] image,int i,int j,int newColor,int oldColor){
        if(i<0 || i>=image.length || j<0 || j>=image[0].length || image[i][j]!=oldColor){
            return;
        }
        image[i][j]=newColor;
        dfs(image,i-1,j,newColor,oldColor);
        dfs(image,i+1,j,newColor,oldColor);
        dfs(image,i,j-1,newColor,oldColor);
        dfs(image,i,j+1,newColor,oldColor);

    }
}
