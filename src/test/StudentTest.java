package test;

import main.Controller;
import main.Criterion;
import main.Rubric;
import main.Student;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

public class StudentTest {
    Criterion criteria1 = new Criterion("Design", 0);
    Criterion criteria2 = new Criterion("Implementation", 0);
    Criterion criteria3 = new Criterion("Testing", 0);

    @Test
    public void testSetStudentName() {
        ArrayList<Criterion> criteria = new ArrayList<Criterion>();
        ArrayList<Rubric> rubrics = new ArrayList<Rubric>();
        criteria.add(criteria1);
        criteria.add(criteria2);
        criteria.add(criteria3);
        Rubric rubric = new Rubric("Maths", criteria);
        rubrics.add(rubric);

        Student unitTest = new Student("John Green", rubrics);
        try {
            unitTest.setName(null);
        } catch (NullPointerException ex) {
            assertEquals("Name cannot be null", ex.getMessage());
        }
        unitTest.setName("Paul Brown");
    }

    @Test
    public void testGetStudentName() {
        ArrayList<Criterion> criteria = new ArrayList<Criterion>();
        ArrayList<Rubric> rubrics = new ArrayList<Rubric>();
        criteria.add(criteria1);
        criteria.add(criteria2);
        criteria.add(criteria3);
        Rubric rubric = new Rubric("Maths", criteria);
        rubrics.add(rubric);

        Student unitTest = new Student("John Green", rubrics);

        assertEquals(unitTest.getName(), "John Green");
    }

    @Test
    public void testSetRubrics() {
        ArrayList<Criterion> criteria = new ArrayList<Criterion>();
        ArrayList<Rubric> rubrics = new ArrayList<Rubric>();
        criteria.add(criteria1);
        criteria.add(criteria2);
        criteria.add(criteria3);
        Rubric rubric = new Rubric("Maths", criteria);
        rubrics.add(rubric);

        Student unitTest = new Student("John Green", rubrics);

        try {
            unitTest.setRubrics(null);
            fail();
        } catch (NullPointerException ex) {
            assertEquals("Rubrics cannot be null", ex.getMessage());
        }

        unitTest.setRubrics(rubrics);
    }

    @Test
    public void testGetRubrics() {
        ArrayList<Criterion> criteria = new ArrayList<Criterion>();
        ArrayList<Rubric> rubrics = new ArrayList<Rubric>();
        criteria.add(criteria1);
        criteria.add(criteria2);
        criteria.add(criteria3);
        Rubric rubric = new Rubric("Maths", criteria);
        rubrics.add(rubric);

        Student unitTest = new Student("John Green", rubrics);
        assertEquals(unitTest.getRubrics(), rubrics);
    }

    @Test
    public void testAddRubrics() {
        ArrayList<Criterion> criteria = new ArrayList<Criterion>();
        ArrayList<Rubric> rubrics = new ArrayList<Rubric>();
        criteria.add(criteria1);
        criteria.add(criteria2);
        criteria.add(criteria3);
        Rubric rubric = new Rubric("Maths", criteria);
        rubrics.add(rubric);

        Student unitTest = new Student("John Green", rubrics);

        try {
            unitTest.addRubrics(null);
            fail();
        } catch (NullPointerException ex) {
            assertEquals("Rubric cannot be null", ex.getMessage());
        }

    }

    @Test
    public void testGetARubric(){
        ArrayList<Criterion> criteria = new ArrayList<Criterion>();
        ArrayList<Rubric> rubrics = new ArrayList<Rubric>();
        criteria.add(criteria1);
        Rubric rubric = new Rubric("Maths", criteria);
        Rubric rubric2 = new Rubric("Businesses", criteria);
        Rubric rubric3 = new Rubric("Java", criteria);

        rubrics.add(rubric);
        rubrics.add(rubric2);
        rubrics.add(rubric3);

        Student unitTest = new Student("John Green", rubrics);


        assertEquals(rubric,unitTest.getARubric("Maths",rubrics));

    }

    @Test
    public void testGetAGrade(){
        ArrayList<Rubric> rubrics = new ArrayList<>();
        Controller unitTest = new Controller();
        ArrayList<Criterion> criteria = new ArrayList<>();
        criteria.add(criteria1);
        criteria.add(criteria2);
        criteria.add(criteria3);

        Rubric rubric = new Rubric("Maths",criteria);
        rubrics.add(rubric);

        Student student = new Student("Una", rubrics);


        unitTest.setGrade(student,"Maths","Design",3);
        unitTest.setGrade(student,"Maths","Implementation",4);
        unitTest.setGrade(student,"Maths","Testing",2);

        assertEquals(9,student.getGrade(rubric));
    }


}
