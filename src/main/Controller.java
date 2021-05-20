package main;

import java.util.ArrayList;

public class Controller {

    public Rubric createRubric(String topic, ArrayList<Criterion> criteria) {
        Rubric rubric = new Rubric(topic, criteria);
        return rubric;
    }

    public void addCriterion(Rubric rubric, Criterion criteria) {
        rubric.addCriteria(criteria);
    }

    public ArrayList<Rubric> getAllRubrics(ArrayList<Rubric> rubrics) {
        return rubrics;
    }

    public Rubric getOneRubric(ArrayList<Rubric> rubrics, String name) {
        Rubric rubric = new Rubric("test", new ArrayList<>());
        for (int x = 0; x < rubrics.size(); x++) {
            if (rubrics.get(x).getTopic() == name) {
                rubric = rubrics.get(x);
            }
        }
        return rubric;
    }

    public Student newStudent(String name) {
        ArrayList<Rubric> rubrics = new ArrayList<>();
        Student student = new Student(name, rubrics);
        return student;
    }

    public void addRubric(Student student, Rubric rubric) {
        student.addRubrics(rubric);
    }

    public void setGrade(Student student, String topic, String criterion, int grade) {
        Rubric rubric = student.getARubric(topic,student.getRubrics());
        Criterion criteria = rubric.getACriterion(rubric.getCriteria(), criterion);
        criteria.setScore(grade);
    }
}
