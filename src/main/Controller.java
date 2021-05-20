package main;

import java.util.ArrayList;

public class Controller {

    public Rubric createRubric(String topic, ArrayList<Criterion> criteria){
        Rubric rubric = new Rubric(topic,criteria);
        return rubric;
    }

    public void addCriterion(Rubric rubric, Criterion criteria){
        rubric.addCriteria(criteria);
    }

    public ArrayList<Rubric> getAllRubrics(ArrayList<Rubric> rubrics){
        return rubrics;
    }

    public Rubric getOneRubric(ArrayList<Rubric> rubrics, String name){
        Rubric rubric = new Rubric("test",new ArrayList<>());
        for(int x = 0; x < rubrics.size(); x++){
            if(rubrics.get(x).getTopic() == name){
                rubric = rubrics.get(x);
            }
        }
        return rubric;
    }

}
