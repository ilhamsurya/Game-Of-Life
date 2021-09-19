package com.game.of.life;


import java.util.*;
import java.lang.*;

import static com.game.of.life.Game.*;
import static com.game.of.life.Grid.*;


public class GameOfLife {
    static final boolean ALIVE = true;
    static final boolean DEAD = false;
    public static void main(String[] args) throws java.io.IOException
    {
        //read in the size of the grid and create arrays
        int size, aliveCnt;
        boolean[][] currentGeneration, nextGeneration;
        Scanner scan = new Scanner(System.in);
        size = getGridSize(scan);
        System.out.println("Input Live Count");
        aliveCnt = scan.nextInt();
        currentGeneration = new boolean[size][size];
        nextGeneration = new boolean[size][size];
        makeRandomGrid(currentGeneration, aliveCnt);
        // read in the number of generations to simulate
        int cycles;
        cycles = askNumberRounds(scan);
        printRound(currentGeneration,nextGeneration,cycles);
    }
}
