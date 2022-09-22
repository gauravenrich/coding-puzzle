package com.lowleveldesign.tiktactoe.service;

import com.lowleveldesign.tiktactoe.model.*;

import java.util.Deque;
import java.util.LinkedList;

public class TicTacToeGame {
    Deque<Player> players;
    Board gameBoard;

    public TicTacToeGame() {
        initializeGame();
    }

    private void initializeGame(){
        players=new LinkedList<>();
        Player player1=new Player("Cuchu",new PlayingPieceX(PieceType.X));
        Player player2=new Player("Tuku",new PlayingPieceO(PieceType.O));
        players.add(player1);
        players.add(player2);
        gameBoard=new Board(3);
    }
    public String startGame(){
        boolean noWinner=true;
        while (noWinner){
            Player playerTurn=players.removeFirst();
            gameBoard.printBoard();;

        }
        return "tie";
    }
    public boolean isThereAWinner(){
        return false;
    }

}
