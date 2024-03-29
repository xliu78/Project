package PairPac;

public class Pair {
    private String question;
    private String answer;
    private float score;
    private int id;
    public Pair(String question, String answer,float score ){
        this.question = question;
        this.answer = answer;
        this.score = score;
    }

    public Pair(String question, String answer,float score,int id ){
        this.question = question;
        this.answer = answer;
        this.score = score;
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public Pair(String question, String answer){
        this.question = question;
        this.answer = answer;
    }

    public Pair(String question,String answer,int id){
        this.question = question;
        this.answer = answer;
        this.id = id;
    }

    public void setQuestion(String question){
        this.question = question;
    }

    public void setAnswer(String answer){
        this.answer = answer;
    }

    public void setScore(float score){
        this.score = score;
    }

    public String getQuestion(){
        return this.question;
    }

    public String getAnswer(){
        return this.answer;
    }

    public float getScore(){
        return this.score;
    }
}
