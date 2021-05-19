package test;

import main.Criterion;
import main.Rubric;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

public class RubricTest {
    Criterion criteria1 = new Criterion("Design",0);
    Criterion criteria2 = new Criterion("Implementation",0);
    Criterion criteria3 = new Criterion("Testing",0);


    @Test
    public void testSetRubric(){
        ArrayList<Criterion> criterion = new ArrayList<Criterion>();
        ArrayList<Criterion> criterion2 = new ArrayList<Criterion>();
        criterion.add(criteria1);
        criterion.add(criteria2);
        criterion.add(criteria3);

        Rubric unitTest = new Rubric(criterion);
        try{
            unitTest.setCriteria(null);
            fail();
        }catch(NullPointerException ex){
            assertEquals("Criteria cannot be null", ex.getMessage());
        }

        for(int x = 0; x < 12; x++){
            criterion2.add(criteria1);
        }

        try{
            unitTest.setCriteria(criterion2);
            fail();
        }catch(ArrayIndexOutOfBoundsException ex){
            assertEquals("Value out of bounds", ex.getMessage());
        }

        unitTest.setCriteria(criterion);
    }

    @Test
    public void testGetRubric(){
        ArrayList<Criterion> criterion = new ArrayList<Criterion>();
        criterion.add(criteria1);
        criterion.add(criteria2);
        criterion.add(criteria3);

        Rubric unitTest = new Rubric(criterion);

        assertEquals(unitTest.getCriteria(),criterion);
    }

    @Test
    public void testAddRubric(){
        ArrayList<Criterion> criterion = new ArrayList<Criterion>();
        ArrayList<Criterion> criterion2 = new ArrayList<Criterion>();
        criterion.add(criteria1);
        criterion.add(criteria2);
        criterion.add(criteria3);

        Rubric unitTest = new Rubric(criterion);
        try{
            unitTest.addCriteria(null);
            fail();
        }catch(NullPointerException ex){
            assertEquals("Criteria cannot be null", ex.getMessage());
        }

        unitTest.addCriteria(criteria1);

        for(int x = 0; x < 10; x++){
            criterion2.add(criteria1);
        }
        unitTest.setCriteria(criterion2);
        try{
            unitTest.addCriteria(criteria1);
            fail();
        }catch(ArrayIndexOutOfBoundsException ex){
            assertEquals("Value out of bounds", ex.getMessage());
        }

    }
}
