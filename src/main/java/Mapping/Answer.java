package Mapping;

import jakarta.persistence.*;

@Entity
public class Answer {
    @Id
    private int answer_id;
    private String answer;
    @ManyToMany(mappedBy = "answers" )
    private Question question;

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Answer() {
        super();
    }

    public Answer(int answer_id, String answer) {
        this.answer_id = answer_id;
        this.answer = answer;
    }

    public int getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(int answer_id) {
        this.answer_id = answer_id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
