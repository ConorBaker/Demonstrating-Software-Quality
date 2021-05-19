package test;
import main.Criterion;

import org.junit.Test;

import static org.junit.Assert.*;

public class CriterionTest {

    @Test
    public void testSetScore() {
        Criterion unitTest = new Criterion("test",1);
        //Over 5
        try {
            unitTest.setScore(7);
            fail();
        } catch (ArithmeticException ex) {
            assertEquals("Value out of bounds", ex.getMessage());
        }
        //Under 0
        try {
            unitTest.setScore(-1);
            fail();
        } catch (ArithmeticException ex) {
            assertEquals("Value out of bounds", ex.getMessage());
        }
        unitTest.setScore(3);
    }


    @Test
    public void testSetTitle(){
        Criterion unitTest = new Criterion("test",1);
        try {
            unitTest.setTitle(null);
            fail();
        } catch (NullPointerException ex) {
            assertEquals("Title must not be null", ex.getMessage());
        }
        unitTest.setTitle("Design");
    }

    @Test
    public void testGetScore(){
        Criterion unitTest = new Criterion("test",3);
        assertEquals(3, unitTest.getScore());
        assertNotEquals(5,unitTest.getScore());
    }

    @Test
    public void testGetTitle(){
        Criterion unitTest = new Criterion("Design",1);
        assertEquals("Design", unitTest.getTitle());
        assertNotEquals("Testing", unitTest.getTitle());
    }


}
