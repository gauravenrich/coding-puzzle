package com.lld.snakeladder;

public class Dice {
    private final int numberOfDice;
    public Dice(int numberOfDice){
        this.numberOfDice=numberOfDice;
    }
    int rollDice(){
        return ((int) (Math.random()*(6*numberOfDice - 1*numberOfDice))) + 1;
    }

    public static void main(String[] args) {
        Dice d=new Dice(1);
        for(int i=1;i<20;i++){
            System.out.println(d.rollDice());
        }

    }
}
