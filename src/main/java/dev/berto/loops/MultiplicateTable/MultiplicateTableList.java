package dev.berto.loops.MultiplicateTable;

import java.util.List;
import java.util.ArrayList;

public class MultiplicateTableList {
    //Attribute
    private int number;

    //Constructor
    public MultiplicateTableList(int number) {
        this.number = number;
    }

    //Method to get the multiplication table
    public List<String> getTable() {
        List<String> table = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            String line = number + " x " + i + " = " + (number * i);
            table.add(line);
        }
        return table;
    }
}
