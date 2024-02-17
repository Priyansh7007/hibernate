package Mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("project started.....");
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Question question = new Question();
        question.setQuestion_id(101);
        question.setQuestion("What is JAVA ? ");

        Answer answer = new Answer();
        answer.setAnswer_id(121);
        answer.setAnswer("Java Is a Programming Language.");
        answer.setQuestion(question);


        Answer answer1 = new Answer();
        answer1.setAnswer_id(122);
        answer1.setAnswer("Java Is a object oriented Language.");
        answer1.setQuestion(question);


        Answer answer2 = new Answer();
        answer2.setAnswer_id(123);
        answer2.setAnswer("Java Is a interpreted language.");
        answer2.setQuestion(question);

        List<Answer> list = new ArrayList<>();
        list.add(answer);
        list.add(answer1);
        list.add(answer2);

        question.setAnswers(list);

        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();

        s.save(question);
        s.save(answer);
        s.save(answer1);
        s.save(answer2);

        tx.commit();
        s.close();

    }
}
