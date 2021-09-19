package com.game.of.life;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CellTest {
    @Test
    // First Rule: cell will die with less than 2 neighbor (Under Population)
    public void ShouldDieWithOnlyOneNeighbor(){
        Cell newCell = new Cell(Cell.LifeState.ALIVE);
        Cell.LifeState current = newCell.GetNextState(1);
        assertEquals(Cell.LifeState.DEAD, current);
    }
    @Test
    public void ShouldDieWithZeroNeighbor(){

    }
}
