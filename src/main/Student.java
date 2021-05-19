package main;

import java.util.ArrayList;

public class Student {
    String name;
    ArrayList<Rubric> rubrics = new ArrayList<>();

    public Student(String name, ArrayList<Rubric> rubrics) {
        this.name = name;
        this.rubrics = rubrics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            throw new NullPointerException("Name cannot be null");
        }

    }

    public ArrayList<Rubric> getRubrics() {
        return rubrics;
    }

    public void setRubrics(ArrayList<Rubric> rubrics) {
        if (rubrics != null) {
            this.rubrics = rubrics;
        } else {
            throw new NullPointerException("Rubrics cannot be null");
        }

    }

    public void addRubrics(Rubric rubric) {
        if(rubric != null){
            this.rubrics.add(rubric);
        }else{
            throw new NullPointerException("Rubric cannot be null");
        }

    }
}
