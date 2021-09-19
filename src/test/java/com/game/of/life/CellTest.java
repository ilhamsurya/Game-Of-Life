package com.game.of.life;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CellTest {
    @Test
    // First Rule: cell will die with less than 2 neighbor (Under Population)

    public void ShouldDieWithZeroNeighbor(){
        Cell newCell = new Cell(Cell.LifeState.ALIVE);
        Cell.LifeState current = newCell.GetNextState(0);
        assertEquals(Cell.LifeState.DEAD, current);
    }

    @Test
    public void ShouldDieWithOnlyOneNeighbor(){
        Cell newCell = new Cell(Cell.LifeState.ALIVE);
        Cell.LifeState current = newCell.GetNextState(1);
        assertEquals(Cell.LifeState.DEAD, current);
    }

    @Test
    //Second Rule Any live cell with two or three live neighbours lives on to the next generation.
    public void ShouldLiveOnWithWwoNeighbor(){
        Cell newCell = new Cell(Cell.LifeState.ALIVE);
        Cell.LifeState current = newCell.GetNextState(2);
        assertEquals(Cell.LifeState.ALIVE, current);
    }

    @Test
    public void ShouldLiveOnWithThreeNeighbor(){
        Cell newCell = new Cell(Cell.LifeState.ALIVE);
        Cell.LifeState current = newCell.GetNextState(3);
        assertEquals(Cell.LifeState.ALIVE, current);
    }

    @Test
    //Third Rule Any live cell with more than three live neighbours dies, as if by overpopulation.
    public void ShouldDieOnWithFourNeighbor(){
        Cell newCell = new Cell(Cell.LifeState.ALIVE);
        Cell.LifeState current = newCell.GetNextState(4);
        assertEquals(Cell.LifeState.DEAD, current);
    }
}
