package com.mapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemoR {
    public static void main(String[] args) {
        System.out.println("project started.....");
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        // Creating Question
        Question q1 = new Question();
        q1.setQuestionId(1212);
        q1.setQuestion("What is Java ?");

        // Creating Answer....
        Answer answer = new Answer();
        answer.setAnswerId(343);
        answer.setAnswer("Java is Programming Language.");

        q1.setAnswer(answer);

        Question q2 = new Question();
        q2.setQuestionId(242);
        q2.setQuestion("What is Collection FrameWork ?");

        // Creating Answer....
        Answer answer1 = new Answer();
        answer1.setAnswerId(344);
        answer1.setAnswer("Api to work with object and java.");

        q2.setAnswer(answer1);

        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();

        s.save(q1);
        s.save(q2);

        tx.commit();
        s.close();
        factory.close();
    }
}
