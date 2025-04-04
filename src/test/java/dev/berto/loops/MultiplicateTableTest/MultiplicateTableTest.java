package dev.berto.loops.MultiplicateTableTest;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dev.berto.loops.MultiplicateTable.MultiplicateTableList;

/**
 * Test class for the MultiplicateTableList class.
 */
// This class tests the functionality of generating a multiplication table.
public class MultiplicateTableTest {
    @Test
    @DisplayName("Test to generate the multiplication table")
    public void testMultiplicateTableList() {
        MultiplicateTableList table = new MultiplicateTableList(5);
        List<String> result = table.getTable();

        List<String> expected = Arrays.asList(
            "1 x 1 = 1",
            "1 x 2 = 2",
            "1 x 3 = 3",
            "1 x 4 = 4",
            "1 x 5 = 5",
            "2 x 1 = 2",
            "2 x 2 = 4",
            "2 x 3 = 6",
            "2 x 4 = 8",
            "2 x 5 = 10",
            "3 x 1 = 3",
            "3 x 2 = 6",
            "3 x 3 = 9",
            "3 x 4 = 12",
            "3 x 5 = 15",
            "4 x 1 = 4",
            "4 x 2 = 8",
            "4 x 3 = 12",
            "4 x 4 = 16",
            "4 x 5 = 20",
            "5 x 1 = 5",
            "5 x 2 = 10",
            "5 x 3 = 15",
            "5 x 4 = 20",
            "5 x 5 = 25"
        );
        assertThat(result, is(expected));
    }
}
