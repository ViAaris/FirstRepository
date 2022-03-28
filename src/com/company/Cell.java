package com.company;

import java.util.ArrayList;
import java.util.List;

public class Cell {
    public List<Cell> nearCells;
    Status status;


    public Cell() {
        status = Status.NONE;
        nearCells = new ArrayList<>();
    }

    public void step1() {
        int around = countNearCells();
        status = status.step1(around);
    }

    public void step2() {
        status = status.step2();
    }

    void addNear(Cell cell) {
        nearCells.add(cell);
    }

     int countNearCells() {
        int count = 0;
        for (Cell cell : nearCells) {
            if (cell.status.isCell()) count++;

        }
        return count;
    }


    public void turn() {
        for (Cell cell : nearCells) {
            cell.status = cell.status.isCell() ? Status.NONE : Status.LIVE;
        }
    }
}
