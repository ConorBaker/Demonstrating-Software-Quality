package main;

public class Criterion {
    String title;
    int score;

    public Criterion(String title, int score) {
        this.title = title;
        this.setScore(score);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title != null){
            this.title = title;
        }else{
            throw new NullPointerException("Title must not be null");
        }

    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if(score > 0 && score < 6){
            this.score = score;
        }else{
            throw new ArithmeticException("Value out of bounds");
        }
    }
}