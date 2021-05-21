package main;

import java.util.ArrayList;
import java.util.HashMap;

public class Caller {

    public void caller(){
        ArrayList<Rubric> rubrics = new ArrayList<>();
        ArrayList<Rubric> rubrics2 = new ArrayList<>();
        ArrayList<Criterion> criteria = new ArrayList<>();
        ArrayList<Criterion> criteria2 = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        Controller controller = new Controller();

        Rubric rubric = controller.createRubric("Maths",criteria);
        rubrics.add(rubric);
        Rubric rubric2 = controller.createRubric("Maths", criteria2);
        rubrics.add(rubric2);

        Criterion Design= new Criterion("Design",0);
        criteria.add(Design);
        Criterion Design2 = new Criterion("Design",0);
        criteria.add(Design2);
        Criterion Testing= new Criterion("Testing",0);
        criteria.add(Testing);
        Criterion Testing2 = new Criterion("Testing",0);
        criteria.add(Testing2);
        Criterion Implementation= new Criterion("Implementation",0);
        criteria.add(Implementation);
        Criterion Implementation2 = new Criterion("Implementation",0);
        criteria.add(Implementation2);

        controller.addCriterion(rubric, Design);
        controller.addCriterion(rubric, Testing);
        controller.addCriterion(rubric, Implementation);

        controller.addCriterion(rubric2, Design2);
        controller.addCriterion(rubric2, Testing2);
        controller.addCriterion(rubric2, Implementation2);

        ArrayList<Rubric> getAllRubrics = controller.getAllRubrics(rubrics);
        Rubric getOneRubric = controller.getOneRubric(rubrics,"Maths");


        Student student = controller.newStudent("Una");
        student.setRubrics(rubrics);
        students.add(student);

        controller.setGrade(student,"Maths","Design",2);
        controller.setGrade(student,"Maths","Implementation",3);
        controller.setGrade(student,"Maths","Testing",4);

        Student student2 = controller.newStudent("Conor");
        student2.setRubrics(rubrics2);
        students.add(student2);

        controller.setGrade(student2,"Maths","Design",2);
        controller.setGrade(student2,"Maths","Implementation",3);
        controller.setGrade(student2,"Maths","Testing",4);

        HashMap<String, Integer> allGrades = controller.getAllGrades(students, rubric);

        int average = controller.calculateAverageRubric(students,rubric.getTopic());
        double standDeviation = controller.calculateSDRubric(students,rubric.getTopic());
        int max = controller.calculateMaxRubric(students,rubric.getTopic());
        int min = controller.calculateMinRubric(students,rubric.getTopic());

        int averageC = controller.calculateAverageRubricAndCriterion(students,rubric.getTopic(),Design.getTitle());
        double standDeviationC = controller.calculateSDRubricAndCriterion(students,rubric.getTopic(),Design.getTitle());
        int maxC = controller.calculateMaxRubricAndCriterion(students,rubric.getTopic(),Design.getTitle());
        int minC = controller.calculateMinRubricAndCriterion(students,rubric.getTopic(),Design.getTitle());

    }
}
