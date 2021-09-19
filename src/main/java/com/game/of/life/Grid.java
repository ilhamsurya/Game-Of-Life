package com.game.of.life;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

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


}
