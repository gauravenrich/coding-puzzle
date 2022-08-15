package com.lowleveldesign.snakeladder;

import java.util.List;
import java.util.Map;
import java.util.Queue;

public class GameBoard {
    private Dice dice;
    private int boardSize;
    private List<Jumper> snakes;
    private List<Jumper> ladders;
    Map<String, Integer> playersCurrentPosition;
    private final Queue<Player> nextTurn;
    public GameBoard(Dice dice,
                     Queue<Player> allPlayers,
                     List<Jumper> snakes,
                     List<Jumper> ladders,
                     Map<String, Integer> playersCurrentPosition,
                     int size) {
        this.boardSize=size;
        this.snakes=snakes;
        this.ladders=ladders;
        this.playersCurrentPosition=playersCurrentPosition;
        this.nextTurn=allPlayers;
        this.dice=dice;
    }

    public void startGame() {
        while (nextTurn.size()>1){
            Player p=nextTurn.poll();
            int currentPosition= playersCurrentPosition.get(p.getPlayerName());
            int diceValue=dice.rollDice();
            System.out.println(p.getPlayerName()+ " dice scored "+diceValue);
            int nextCell=currentPosition+diceValue;
            if(nextCell==boardSize){
                System.out.println( p.getPlayerName() + " won the game");
            }else if(nextCell>boardSize){
                nextTurn.offer(p);
            }else {
                int[] nextPosition= new int[1];
                boolean[] b =new boolean[1];
                nextPosition[0]=nextCell;
                snakes.forEach(t->{
                    if(t.getStartPoint()==nextCell){
                        nextPosition[0]=t.getEndPoint();
                    }
                });
                if(nextPosition[0]!=nextCell){
                    System.out.println(p.getPlayerName() + " Bitten by Snake present at: "+ nextCell);
                }
                ladders.forEach(t->{
                    if(t.getStartPoint()==nextCell){
                        nextPosition[0]=t.getEndPoint();
                        b[0]=true;
                    }
                });
                if(nextPosition[0]!=nextCell){
                    System.out.println(p.getPlayerName() + " Got Ladder present at: "+ nextCell);
                }
                if (nextPosition[0]==boardSize){
                    System.out.println( p.getPlayerName() + " won the game");
                }else {
                    playersCurrentPosition.put(p.getPlayerName(),nextPosition[0]);
                    System.out.println(p.getPlayerName() + " is at position "+ nextPosition[0]);
                    nextTurn.offer(p);
                }
            }
        }
    }
}
