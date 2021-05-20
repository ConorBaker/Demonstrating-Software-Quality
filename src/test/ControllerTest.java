package test;

import main.Controller;
import main.Criterion;
import main.Rubric;
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

}
