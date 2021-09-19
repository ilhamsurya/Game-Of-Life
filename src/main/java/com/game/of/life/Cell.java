package com.game.of.life;

public class Cell {

    private LifeState state;

    public Cell(LifeState state) {
        this.state = state;

    }
    public enum LifeState{
        ALIVE, DEAD
    }
    public LifeState GetNextState(int n){
        if (n > 1) {
            return LifeState.ALIVE;
        }else{
            return LifeState.DEAD;
        }

    }
}
