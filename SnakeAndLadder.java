package com.Bridgelabz;

import java.util.Scanner;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to The  Snake and Ladder game");
        System.out.println("Single Player at Start Position 0");
        int RollDice=(int)(Math.random()*6+1);
        System.out.println("Player 1 rolls the dies and get:" +RollDice);
        Scanner Iv=new Scanner(System.in);
        System.out.println("Enter option: ");
        int option=Iv.nextInt();
        int position=0;
        switch (option){
            case 1:
                System.out.println("NO of Play: " +position);
                System.out.println("Player stays in th same position");
            case 2:
                System.out.println("Ladder:" +(RollDice+position));
                System.out.println("Player moves ahead by: " +RollDice);
            case 3:
                System.out.println("Snake:" +(RollDice+position));
                System.out.println("Player moves behind :" +RollDice);
        }
    }
}
