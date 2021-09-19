package com.game.of.life;

public class Cell {

    private LifeState state;

    public Cell(LifeState state) {
        this.state = state;

    }
    public enum LifeState{
        ALIVE, DEAD
    }
    public LifeState GetNextState(int i){
        return LifeState.DEAD;
    }
}
