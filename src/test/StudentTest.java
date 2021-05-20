package test;

import main.Criterion;
import main.Rubric;
import main.Student;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

public class StudentTest {
    Criterion criteria1 = new Criterion("Design",0);
    Criterion criteria2 = new Criterion("Implementation",0);
    Criterion criteria3 = new Criterion("Testing",0);

    @Test
    public void testSetStudentName(){
        ArrayList<Criterion> criteria = new ArrayList<Criterion>();
        ArrayList<Rubric> rubrics = new ArrayList<Rubric>();
        criteria.add(criteria1);
        criteria.add(criteria2);
        criteria.add(criteria3);
        Rubric rubric = new Rubric("Maths",criteria);
        rubrics.add(rubric);

        Student unitTest = new Student("John Green", rubrics);
        try{
            unitTest.setName(null);
        }catch (NullPointerException ex){
            assertEquals("Name cannot be null", ex.getMessage());
        }
        unitTest.setName("Paul Brown");
    }

    @Test
    public void testGetStudentName(){
        ArrayList<Criterion> criteria = new ArrayList<Criterion>();
        ArrayList<Rubric> rubrics = new ArrayList<Rubric>();
        criteria.add(criteria1);
        criteria.add(criteria2);
        criteria.add(criteria3);
        Rubric rubric = new Rubric("Maths",criteria);
        rubrics.add(rubric);

        Student unitTest = new Student("John Green", rubrics);

        assertEquals(unitTest.getName(),"John Green");
    }

    @Test
    public void testSetRubrics(){
        ArrayList<Criterion> criteria = new ArrayList<Criterion>();
        ArrayList<Rubric> rubrics = new ArrayList<Rubric>();
        criteria.add(criteria1);
        criteria.add(criteria2);
        criteria.add(criteria3);
        Rubric rubric = new Rubric("Maths",criteria);
        rubrics.add(rubric);

        Student unitTest = new Student("John Green", rubrics);

        try{
            unitTest.setRubrics(null);
            fail();
        }catch (NullPointerException ex){
            assertEquals("Rubrics cannot be null", ex.getMessage());
        }

        unitTest.setRubrics(rubrics);
    }

    @Test
    public void testGetRubrics(){
        ArrayList<Criterion> criteria = new ArrayList<Criterion>();
        ArrayList<Rubric> rubrics = new ArrayList<Rubric>();
        criteria.add(criteria1);
        criteria.add(criteria2);
        criteria.add(criteria3);
        Rubric rubric = new Rubric("Maths",criteria);
        rubrics.add(rubric);

        Student unitTest = new Student("John Green", rubrics);
        assertEquals(unitTest.getRubrics(),rubrics);
    }

    @Test
    public void testAddRubrics(){
        ArrayList<Criterion> criteria = new ArrayList<Criterion>();
        ArrayList<Rubric> rubrics = new ArrayList<Rubric>();
        criteria.add(criteria1);
        criteria.add(criteria2);
        criteria.add(criteria3);
        Rubric rubric = new Rubric("Maths",criteria);
        rubrics.add(rubric);

        Student unitTest = new Student("John Green", rubrics);

        try{
            unitTest.addRubrics(null);
            fail();
        }catch (NullPointerException ex){
            assertEquals("Rubric cannot be null", ex.getMessage());
        }

    }

}
