package main;

import java.util.ArrayList;

public class Rubric {
    ArrayList<Criterion> Criteria = new ArrayList<>();

    public Rubric(ArrayList<Criterion> criteria) {
        this.Criteria = criteria;
    }

    public ArrayList<Criterion> getCriteria() {
        return Criteria;
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
