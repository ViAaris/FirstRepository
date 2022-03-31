package com.company;

public class NewClass2 {

    Cell cell;


    NewClass2 newClass2;

    public NewClass2(NewClass2 nw){
        this.newClass2 = nw;
        System.out.println(user1);
        System.out.println(user2);

    }


    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public com.company.NewClass2 getNewClass2() {
        return newClass2;
    }

    public void setNewClass2(com.company.NewClass2 newClass2) {
        this.newClass2 = newClass2;

    @Override
    public String toString() {
        return "NewClass2{" +
                "cell=" + cell +
                ", newClass2=" + newClass2 +
                '}';

    }
}
