package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    public void sampleTestThatPasses(){
        assertEquals("This test should pass", "This test should pass");
        assertTrue(8>5);
        assertFalse(8<5);
    }

    @Test
    public void calcAreaTest(){
        Triangle myTriangle = new Triangle(3, 4,5);
        assertEquals(6, myTriangle.calcArea(), 0.0001);
    }

    @Test
    public void doubleSizeTest(){
        Triangle myTriangle = new Triangle(3, 4,5);
        assertEquals(6, myTriangle.doubleSize(), 0.0001);
    }

    @Test
    public void longestLineTest(){
        Triangle myTriangle = new Triangle(3, 4,5);
        assertEquals(5, myTriangle.longestLineWithin(), 0.0001);
    }
}
