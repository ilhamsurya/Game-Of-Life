package com.game.of.life;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static com.game.of.life.Game.printState;
import static com.game.of.life.GameOfLife.*;

public class Grid {

    public static int getGridSize(Scanner scan) {
        int gridSize;
        System.out.println("Welcome to Game of Life!");
        System.out.println("What size grid will you be playing with?");
        System.out.println("type an integer and then press enter...");
        gridSize = scan.nextInt();
        return gridSize;
    }

    public static void makeRandomGrid(boolean[][] w, int aliveCnt) {
        int m = w.length;
        int n = w[0].length;
        // set all cells empty
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                w[i][j] = DEAD;
            }
        }
        // pick aliveCnt random cells to set empty
        ArrayList<Integer> slots = new ArrayList<Integer>();
        for (int i = 0; i < m * n; i++) {
            slots.add(i);
        }
        Collections.shuffle(slots);
        int row, col;
        for (int i = 0; i < aliveCnt; i++) {
            int idx = slots.get(i);
            row = idx / m;
            col = idx % n;
            w[row][col] = ALIVE;
        }
        System.out.println("This is your grid:");
        printState(w);
        System.out.println("An X is an alive cell and a . is a dead cell.");

    }

}
