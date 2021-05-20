package main;

import java.util.ArrayList;

public class Rubric {
    String topic;
    ArrayList<Criterion> Criteria = new ArrayList<>();

    public Rubric(String topic, ArrayList<Criterion> criteria) {
        this.topic = topic;
        this.Criteria = criteria;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        if(topic != null){
            this.topic = topic;
        }else{
            throw new NullPointerException("Topic cannot be null");
        }

    }

    public ArrayList<Criterion> getCriteria() {
        return Criteria;
    }

    public Criterion getACriterion(ArrayList<Criterion> criteria, String criterion){
        Criterion crit = new Criterion("",0);
        for(int i = 0; i < criteria.size(); i++){
            if(criteria.get(i).getTitle() == criterion){
                crit = criteria.get(i);
            }
        }
        return crit;
    }

    public void setCriteria(ArrayList<Criterion> criteria) {
        if(criteria == null){
            throw new NullPointerException("Criteria cannot be null");
        }else if(criteria.size() > 10){
            throw new ArrayIndexOutOfBoundsException("Value out of bounds");
        }else{
            this.Criteria = criteria;
        }
    }

    public void addCriteria(Criterion criteria){
        if(criteria == null){
            throw new NullPointerException("Criteria cannot be null");
        }else if(this.Criteria.size() < 10){
            this.Criteria.add(criteria);
        }else{
            throw new ArrayIndexOutOfBoundsException("Value out of bounds");
        }

    }
}
