package com.company;

import java.util.ArrayList;
import java.util.List;

public class Cell {
    public List<Cell> near;
    Status status;


    public Cell() {
        status = Status.NONE;
        near = new ArrayList<>();
    }

    public void step1() {
        int around = countNearCells();
        status = status.step1(around);
    }

    public void step2() {
        status = status.step2();
    }

    void addNear(Cell cell) {
        near.add(cell);
    }

     int countNearCells() {
        int count = 0;
        for (Cell cell : near) {
            if (cell.status.isCell()) count++;

        }
        return count;
    }


    public void turn() {
        for (Cell cell : near) {
            cell.status = cell.status.isCell() ? Status.NONE : Status.LIVE;
        }
    }
}
