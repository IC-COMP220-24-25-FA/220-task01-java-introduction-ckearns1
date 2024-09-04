package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void sampleTestThatPasses(){
        assertEquals("This test should pass", "This test should pass");
        assertTrue(8>5);
        assertFalse(8<5);
    }

    @Test
    public void calcAreaTest(){
        Rectangle myRectangle = new Rectangle(3, 2);
        assertEquals(6, myRectangle.calcArea(), 0.0001);
    }

    @Test
    public void doubleSizeTest(){
        Rectangle myRectangle = new Rectangle(3, 2);
        assertEquals(12, myRectangle.doubleSize(), 0.0001);
    }
}
