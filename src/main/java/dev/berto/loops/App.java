package dev.berto.loops;

import java.util.List;

import dev.berto.loops.MultiplicateTable.MultiplicateTableList;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        MultiplicateTableList table = new MultiplicateTableList(5);
        List<String> result = table.getTable();
        for (String line : result) {
            System.out.println(line);
        }
    }
}
