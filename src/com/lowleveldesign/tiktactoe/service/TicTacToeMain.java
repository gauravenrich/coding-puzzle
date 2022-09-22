package com.lowleveldesign.tiktactoe.service;

public class TicTacToeMain {
    public static void main(String[] args) {
        TicTacToeGame ticTacToeGame=new TicTacToeGame();
        System.out.println("Winner is "+ticTacToeGame.startGame());
    }
}
