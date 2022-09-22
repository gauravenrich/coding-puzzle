package com.lowleveldesign.tiktactoe.model;

import java.util.ArrayList;
import java.util.List;


public class Board {
    int size;
    PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].pieceType.name() + "   ");
                } else {
                    System.out.print("    ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

    public List<Pair> getFreeCells(){
        List<Pair> freeCells=new ArrayList<>();
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]==null){
                    Pair rowColumn=new Pair(i,j);
                    freeCells.add(rowColumn);
                }
            }
        }
        return freeCells;
    }
}
