package test;

import main.Controller;
import main.Criterion;
import main.Rubric;
import main.Student;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ControllerTest {

    Criterion Design = new Criterion("Design",0);
    Criterion Implementation = new Criterion("Implementation",0);
    Criterion Testing = new Criterion("Testing",0);
    Criterion Documentation = new Criterion("Documentation", 0);

    @Test
    public void testCreateRubric(){
        Controller unitTest = new Controller();
        ArrayList<Criterion> criteria = new ArrayList<>();

        Rubric rubric = new Rubric("Maths",criteria);
        Rubric rubric2 = unitTest.createRubric("Maths",criteria);

        assertEquals(rubric.getTopic(),rubric2.getTopic());

    }

    @Test
    public void testAddRubric(){
        Controller unitTest = new Controller();
        ArrayList<Criterion> criteria = new ArrayList<>();
        ArrayList<Criterion> criteria2 = new ArrayList<>();

        Rubric rubric = new Rubric("Maths",criteria);
        Rubric rubric2 = new Rubric("Maths",criteria2);
        unitTest.addCriterion(rubric2,Design);

        assertNotEquals(rubric.getCriteria(),rubric2.getCriteria());
    }

    @Test
    public void testGetAllRubrics(){
        ArrayList<Rubric> rubrics = new ArrayList<>();
        Controller unitTest = new Controller();
        ArrayList<Criterion> criteria = new ArrayList<>();
        Rubric rubric = new Rubric("Maths",criteria);
        Rubric rubric2 = new Rubric("Java",criteria);
        Rubric rubric3 = new Rubric("Business",criteria);
        rubrics.add(rubric);
        rubrics.add(rubric2);
        rubrics.add(rubric3);

        assertEquals(rubrics,unitTest.getAllRubrics(rubrics));

    }

    @Test
    public void testGetOneRubric(){
        ArrayList<Rubric> rubrics = new ArrayList<>();
        Controller unitTest = new Controller();
        ArrayList<Criterion> criteria = new ArrayList<>();
        Rubric rubric = new Rubric("Maths",criteria);
        Rubric rubric2 = new Rubric("Java",criteria);
        Rubric rubric3 = new Rubric("Business",criteria);
        rubrics.add(rubric);
        rubrics.add(rubric2);
        rubrics.add(rubric3);

        assertEquals(rubric.getTopic(), unitTest.getOneRubric(rubrics,"Maths").getTopic());
    }

    @Test
    public void testNewStudent(){
        Controller unitTest = new Controller();
        Student student = unitTest.newStudent("Una");
        Student student2 = new Student("Una",new ArrayList<>());
        assertEquals(student.getName(),student2.getName());
    }

    @Test
    public void testAddRubricToStudent(){
        Controller unitTest = new Controller();
        ArrayList<Rubric> rubrics = new ArrayList<>();
        ArrayList<Criterion> criteria = new ArrayList<>();
        Rubric rubric = new Rubric("Maths",criteria);

        Student student = new Student("Una", new ArrayList<>());

        assertEquals(student.getRubrics().size(),0);

        unitTest.addRubric(student,rubric);

        assertEquals(student.getRubrics().size(),1);
    }

    @Test
    public void testSetGrade(){
        ArrayList<Rubric> rubrics = new ArrayList<>();
        ArrayList<Rubric> rubrics2 = new ArrayList<>();

        Controller unitTest = new Controller();

        ArrayList<Criterion> criteria = new ArrayList<>();
        Criterion Design2 = new Criterion("Design",0);
        ArrayList<Criterion> criteria2 = new ArrayList<>();

        criteria.add(Design);
        criteria2.add(Design2);

        Rubric rubric = new Rubric("Maths",criteria);
        Rubric rubric2 = new Rubric("Java",criteria);
        Rubric rubric3 = new Rubric("Business",criteria);
        rubrics.add(rubric);
        rubrics.add(rubric2);
        rubrics.add(rubric3);

        Rubric rubric4 = new Rubric("Maths",criteria2);
        Rubric rubric5 = new Rubric("Java",criteria2);
        Rubric rubric6  = new Rubric("Business",criteria2);
        rubrics2.add(rubric4);
        rubrics2.add(rubric5);
        rubrics2.add(rubric6);

        Student student = new Student("Una", rubrics);
        Student student2 = new Student("Conor", rubrics2);

        unitTest.setGrade(student,"Maths","Design",3);
        unitTest.setGrade(student2,"Maths","Design",5);

        assertNotEquals(student.getARubric("Maths",student.getRubrics()).getACriterion(student.getARubric("Maths",student.getRubrics()).getCriteria(),"Design").getScore(),
                student2.getARubric("Maths",student2.getRubrics()).getACriterion(student2.getARubric("Maths",student2.getRubrics()).getCriteria(),"Design").getScore());

    }

}
