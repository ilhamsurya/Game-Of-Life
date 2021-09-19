package com.game.of.life;

import java.util.Scanner;

import static com.game.of.life.GameOfLife.*;

public class Game {
    public static int askNumberRounds(Scanner scan) {
        System.out.println("How many rounds do you want to play?");
        System.out.println("type ... round");
        boolean done = false;
        int r = 0;
        while (!done) {
            if (scan.hasNextInt()) {
                r = scan.nextInt();
                done = true;
            }
            else {
                System.out.println("You did not enter an integer! Try again.");
            }
        }
        return r;
    }
    public static void printRound(boolean[][] currentGeneration, boolean[][] nextGeneration, int cycles){
        System.out.println("Round 1: ");

        for (int i = 2; i <= cycles; i++) {
            System.out.println();
            System.out.println("Round " + i + ":");

            boolean[][] temp = nextGeneration;
            nextGeneration = currentGeneration;
            currentGeneration = temp;

        }
    }


}
