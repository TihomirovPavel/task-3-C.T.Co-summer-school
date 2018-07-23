package test.java.lv.ctco.interview;

import main.java.lv.ctco.interview.Main;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @org.junit.jupiter.api.Test
    void testForClosableStringRemoveCloseablePairs() {
        Assertions.assertEquals(0, Main.removeCloseablePairs("(){}[]").length());
    }

    @org.junit.jupiter.api.Test
    void testForEmptyStringRemoveCloseablePairs() {
        assertEquals(0, Main.removeCloseablePairs("").length());
    }

    @org.junit.jupiter.api.Test
    void testForUnclosableStringRemoveCloseablePairs() {
        assertEquals(5, Main.removeCloseablePairs("({(})").length());
    }

}