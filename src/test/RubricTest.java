package test;

import main.Criterion;
import main.Rubric;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

public class RubricTest {
    Criterion criterion1 = new Criterion("Design",0);
    Criterion criterion2 = new Criterion("Implementation",0);
    Criterion criterion3 = new Criterion("Testing",0);

    @Test
    public void testSetTopic(){
        ArrayList<Criterion> criteria = new ArrayList<Criterion>();
        criteria.add(criterion1);
        criteria.add(criterion2);
        criteria.add(criterion3);

        Rubric unitTest = new Rubric("Maths",criteria);

        try{
            unitTest.setTopic(null);
            fail();
        }catch(NullPointerException ex){
            assertEquals("Topic cannot be null", ex.getMessage());
        }

        unitTest.setTopic("English");
    }

    @Test
    public void testGetTopic(){
        ArrayList<Criterion> criteria = new ArrayList<Criterion>();
        criteria.add(criterion1);
        criteria.add(criterion2);
        criteria.add(criterion3);

        Rubric unitTest = new Rubric("Maths",criteria);

        assertEquals(unitTest.getTopic(),"Maths");
    }


    @Test
    public void testSetRubric(){
        ArrayList<Criterion> criteria = new ArrayList<Criterion>();
        ArrayList<Criterion> criteria2 = new ArrayList<Criterion>();
        criteria.add(criterion1);
        criteria.add(criterion2);
        criteria.add(criterion3);

        Rubric unitTest = new Rubric("Maths",criteria);
        try{
            unitTest.setCriteria(null);
            fail();
        }catch(NullPointerException ex){
            assertEquals("Criteria cannot be null", ex.getMessage());
        }

        for(int x = 0; x < 12; x++){
            criteria2.add(criterion1);
        }

        try{
            unitTest.setCriteria(criteria2);
            fail();
        }catch(ArrayIndexOutOfBoundsException ex){
            assertEquals("Value out of bounds", ex.getMessage());
        }

        unitTest.setCriteria(criteria);
    }

    @Test
    public void testGetRubric(){
        ArrayList<Criterion> criteria = new ArrayList<Criterion>();
        criteria.add(criterion1);
        criteria.add(criterion2);
        criteria.add(criterion3);

        Rubric unitTest = new Rubric("Maths",criteria);

        assertEquals(unitTest.getCriteria(),criteria);
    }

    @Test
    public void testAddRubric(){
        ArrayList<Criterion> criteria = new ArrayList<Criterion>();
        ArrayList<Criterion> criteria2 = new ArrayList<Criterion>();
        criteria.add(criterion1);
        criteria.add(criterion2);
        criteria.add(criterion3);

        Rubric unitTest = new Rubric("Maths",criteria);
        try{
            unitTest.addCriteria(null);
            fail();
        }catch(NullPointerException ex){
            assertEquals("Criteria cannot be null", ex.getMessage());
        }

        unitTest.addCriteria(criterion1);

        for(int x = 0; x < 10; x++){
            criteria2.add(criterion1);
        }
        unitTest.setCriteria(criteria);
        try{
            unitTest.addCriteria(criterion1);
            fail();
        }catch(ArrayIndexOutOfBoundsException ex){
            assertEquals("Value out of bounds", ex.getMessage());
        }
    }

}
