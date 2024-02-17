package org.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Project Started");
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        //creating Student

//        Student st = new Student();

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Name of Student : ");
//        String name = sc.nextLine();
//        System.out.println("Enter the city of student : ");
//        String city = sc.next();
//        System.out.println("Enter the id of Student : ");
//        int id = sc.nextInt();


//        st.setId(1);
//        st.setName("harsh");
//        st.setCity("delhi");
       // System.out.println(st);

        //Creating object of Address Class
//        StudentAddress ad = new StudentAddress();
//        ad.setStreet("street1");
//        ad.setCity("GuruGram");
//        ad.setOpen(true);
//        ad.setAddedDate(new Date());
//        ad.setX(123.123465);

        // reading Image
//        FileInputStream fis = new FileInputStream("src/main/java/img.png");
//        byte[] data = new byte[fis.available()];
//        fis.read(data);
//        ad.setImage(data);




//        // insert Question...
//
//        Question q1 = new Question();
//        q1.setQuestionId(1212);
//        q1.setQuestion("What is JAVA ?");
//
//
//        // Creating Answer
//
//        Answer ans = new Answer();
//        ans.setAnswerId(343);
//        ans.setAnswer("Java is a Programming Language.");
//        ans.setQuestion(q1);
//
//
//        Answer ans1 = new Answer();
//        ans1.setAnswerId(344);
//        ans1.setAnswer("API to work with object in java .");
//        ans1.setQuestion(q1);
//
//        Answer ans2 = new Answer();
//        ans2.setAnswerId(345);
//        ans2.setAnswer("JAVA is is object oriented programming language .");
//        ans2.setQuestion(q1);
//
//        List<Answer> list = new ArrayList<>();
//        list.add(ans);
//        list.add(ans1);
//        list.add(ans2);
//        q1.setAnswers(list);
//

        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();
//        try {
//
////            Question q = (Question)session.get(Question.class,1212);
////            System.out.println(q.getQuestion());
////            for (Answer a : q.getAnswers()){
////                System.out.println(a.getAnswer());
////            }
//            session.save(q1);
//            session.save(ans);
//            session.save(ans1);
//            session.save(ans2);
//        }catch (Exception e){
//            System.out.println("There have some exception : "+e);
//        }
//       // session.save(st);
//       // session.save(ad);

        tx.commit();

        session.close();
        factory.close();
        System.out.println("Done...");


//        System.out.println(factory);
//        System.out.println(factory.isClosed());
//        System.out.println("Project Finished");
        }
    }
