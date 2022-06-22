package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void whenPositionA6() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A6);
        Cell result = bishopBlack.position();
        Cell expected = Cell.A6;
        assertEquals(result, expected);
    }

    @Test
    public void whenCopyC8ThenA6() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Cell result = bishopBlack.copy(Cell.A6).position();
        Cell expected = new BishopBlack(Cell.A6).position();
        assertEquals(result, expected);
    }

    @Test
    public void whenPositionC1WayG5ThenD2E3F4G5() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] result = bishopBlack.way(Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertArrayEquals(result, expected);
    }

    @Test
    public void whenPositionG5WayC1ThenF4E3D2C1() {
        BishopBlack bishopBlack = new BishopBlack(Cell.G5);
        Cell[] result = bishopBlack.way(Cell.C1);
        Cell[] expected = {Cell.F4, Cell.E3, Cell.D2, Cell.C1};
        assertArrayEquals(result, expected);
    }

    @Test
    public void whenPositionD8WayH4ThenE7F6G5H4() {
        BishopBlack bishopBlack = new BishopBlack(Cell.D8);
        Cell[] result = bishopBlack.way(Cell.H4);
        Cell[] expected = {Cell.E7, Cell.F6, Cell.G5, Cell.H4};
        assertArrayEquals(result, expected);
    }

    @Test
    public void whenPositionE3WayB6ThenD4C5B6() {
        BishopBlack bishopBlack = new BishopBlack(Cell.E3);
        Cell[] result = bishopBlack.way(Cell.B6);
        Cell[] expected = {Cell.D4, Cell.C5, Cell.B6};
        assertArrayEquals(result, expected);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenMoveNotPossible() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] result = bishopBlack.way(Cell.B3);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenMoveNotPossible2() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F8);
        Cell[] result = bishopBlack.way(Cell.D5);
    }
}
