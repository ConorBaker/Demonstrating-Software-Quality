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


    public int calculateAverageRubric(ArrayList<Student> students, String rubric){
        int count = 0;
        int avg = 0;
        for(int x = 0; x < students.size(); x++){
            ArrayList<Rubric> rubrics = students.get(x).getRubrics();
            for(int i = 0; i < rubrics.size(); i++){
                if(rubrics.get(i).getTopic() == rubric){
                    ArrayList<Criterion> criteria = rubrics.get(i).getCriteria();
                    for(int y = 0; y < criteria.size() ; y++){
                        count++;
                        avg = avg + criteria.get(y).getScore();
                    }
                }
            }
        }
        return avg/count;
    }

    public double calculateSDRubric(ArrayList<Student> students, String rubric){
        int count = 0;
        int avg = 0;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Double> numbers2 = new ArrayList<Double>();
        for(int x = 0; x < students.size(); x++){
            ArrayList<Rubric> rubrics = students.get(x).getRubrics();
            for(int i = 0; i < rubrics.size(); i++){
                if(rubrics.get(i).getTopic() == rubric){
                    ArrayList<Criterion> criteria = rubrics.get(i).getCriteria();
                    for(int y = 0; y < criteria.size() ; y++){
                        count++;
                        avg = avg + criteria.get(y).getScore();
                        numbers.add(criteria.get(y).getScore());
                    }
                }
            }
        }

         int avg2= avg/count;

        for(int u = 0; u < numbers.size(); u++){
            double t = numbers.get(u) - avg2;
            double t2 = t * t;
            numbers2.add(t2);
        }
        double sd = 0;

        for(int p = 0; p < numbers2.size(); p++){
           sd = sd + numbers2.get(p);
        }

        double fin = sd / numbers2.size();

        return Math.sqrt(Math.sqrt(fin));

    }

    public int calculateMinRubric(ArrayList<Student> students, String rubric){
        int temp = 5;
        int low = temp;
        for(int x = 0; x < students.size(); x++){
            ArrayList<Rubric> rubrics = students.get(x).getRubrics();
            for(int i = 0; i < rubrics.size(); i++){
                if(rubrics.get(i).getTopic() == rubric){
                    ArrayList<Criterion> criteria = rubrics.get(i).getCriteria();
                    for(int y = 0; y < criteria.size() ; y++){
                        if(criteria.get(y).getScore() <= temp){
                            low = criteria.get(y).getScore();
                            temp = low;
                        }
                    }
                }
            }
        }
        return low;
    }

    public int calculateMaxRubric(ArrayList<Student> students, String rubric){
        int temp = 1;
        int high = temp;
        for(int x = 0; x < students.size(); x++){
            ArrayList<Rubric> rubrics = students.get(x).getRubrics();
            for(int i = 0; i < rubrics.size(); i++){
                if(rubrics.get(i).getTopic() == rubric){
                    ArrayList<Criterion> criteria = rubrics.get(i).getCriteria();
                    for(int y = 0; y < criteria.size() ; y++){
                        if(criteria.get(y).getScore() >= temp){
                            high = criteria.get(y).getScore();
                            temp = high;
                        }
                    }
                }
            }
        }
        return high;
    }



    public int calculateAverageRubricAndCriterion(ArrayList<Student> students, String rubric, String criterion){
        int count = 0;
        int avg = 0;
        for(int x = 0; x < students.size(); x++){
            ArrayList<Rubric> rubrics = students.get(x).getRubrics();
            for(int i = 0; i < rubrics.size(); i++){
                if(rubrics.get(i).getTopic() == rubric){
                    ArrayList<Criterion> criteria = rubrics.get(i).getCriteria();
                    for(int y = 0; y < criteria.size() ; y++){
                        if(criteria.get(y).getTitle() == criterion){
                            count++;
                            avg = avg + criteria.get(y).getScore();
                        }
                    }
                }
            }
        }
        return avg/count;
    }

    public double calculateSDRubricAndCriterion(ArrayList<Student> students, String rubric, String criterion){
        int count = 0;
        int avg = 0;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Double> numbers2 = new ArrayList<Double>();
        for(int x = 0; x < students.size(); x++){
            ArrayList<Rubric> rubrics = students.get(x).getRubrics();
            for(int i = 0; i < rubrics.size(); i++){
                if(rubrics.get(i).getTopic() == rubric){
                    ArrayList<Criterion> criteria = rubrics.get(i).getCriteria();
                    for(int y = 0; y < criteria.size() ; y++){
                        if(criteria.get(y).getTitle() == criterion) {
                            count++;
                            avg = avg + criteria.get(y).getScore();
                            numbers.add(criteria.get(y).getScore());
                        }
                    }
                }
            }
        }

        int avg2= avg/count;

        for(int u = 0; u < numbers.size(); u++){
            double t = numbers.get(u) - avg2;
            double t2 = t * t;
            numbers2.add(t2);
        }
        double sd = 0;

        for(int p = 0; p < numbers2.size(); p++){
            sd = sd + numbers2.get(p);
        }

        double fin = sd / numbers2.size();

        return Math.sqrt(Math.sqrt(fin));

    }

    public int calculateMinRubricAndCriterion(ArrayList<Student> students, String rubric, String criterion){
        int temp = 5;
        int low = temp;
        for(int x = 0; x < students.size(); x++){
            ArrayList<Rubric> rubrics = students.get(x).getRubrics();
            for(int i = 0; i < rubrics.size(); i++){
                if(rubrics.get(i).getTopic() == rubric){
                    ArrayList<Criterion> criteria = rubrics.get(i).getCriteria();
                    for(int y = 0; y < criteria.size() ; y++){
                        if(criteria.get(y).getScore() <= temp){
                            if(criteria.get(y).getTitle() == criterion) {
                                low = criteria.get(y).getScore();
                                temp = low;
                            }
                        }
                    }
                }
            }
        }
        return low;
    }

    public int calculateMaxRubricAndCriterion(ArrayList<Student> students, String rubric, String criterion){
        int temp = 1;
        int high = temp;
        for(int x = 0; x < students.size(); x++){
            ArrayList<Rubric> rubrics = students.get(x).getRubrics();
            for(int i = 0; i < rubrics.size(); i++){
                if(rubrics.get(i).getTopic() == rubric){
                    ArrayList<Criterion> criteria = rubrics.get(i).getCriteria();
                    for(int y = 0; y < criteria.size() ; y++){
                        if(criteria.get(y).getScore() >= temp){
                            if(criteria.get(y).getTitle() == criterion) {
                                high = criteria.get(y).getScore();
                                temp = high;
                            }
                        }
                    }
                }
            }
        }
        return high;
    }




}
