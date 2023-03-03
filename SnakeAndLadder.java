package com.Bridgelabz;

import java.util.Scanner;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to The  Snake and Ladder game");
        System.out.println("Single Player at Start Position 0");
        int positionFirstPlayer=0;
        boolean currentTurn=true;
        while (positionFirstPlayer!=100){
            if (currentTurn==true){
                System.out.println("Player1 currently at position" +positionFirstPlayer);
        int RollDice=(int)(Math.random()*6+1);
        System.out.println("Player 1 rolls the dies and get:" +RollDice);
        int currentOption=(int)(Math.random()*3+1);
        switch (currentOption) {
            case 1:
                System.out.println("NO of Play: " + positionFirstPlayer);
                System.out.println("Player stays in th same position");
                break;
            case 2:
                System.out.println("Ladder:" + (RollDice + positionFirstPlayer));
                System.out.println("Player moves ahead by: " + RollDice);
                positionFirstPlayer=positionFirstPlayer+RollDice;
                break;
            case 3:
                System.out.println("Snake:" + (RollDice + positionFirstPlayer));
                System.out.println("Player moves behind :" + RollDice);
                positionFirstPlayer=positionFirstPlayer-RollDice;
                break;
        }
        if (positionFirstPlayer<0){
            positionFirstPlayer=0;
        }
                if (positionFirstPlayer > 100) {
                    positionFirstPlayer -=RollDice;
                    System.out.println();
                }
        }
        }
        System.out.println("Player 1 reached the winning position 100");
    }
}

