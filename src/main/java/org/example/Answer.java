package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Answer {
    @Id
    @Column(name = "answer_id")
    private int answerId;
    private String answer;

    @ManyToOne
    private Question question;

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Answer() {
        super();
    }

    public Answer(int answerId, String answer, Question question) {
        this.answerId = answerId;
        this.answer = answer;
        this.question = question;
    }
}
