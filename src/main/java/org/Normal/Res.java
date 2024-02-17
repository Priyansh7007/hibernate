package org.Normal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class Res {
    public static void main(String[] args) {
        System.out.println("Project started.......");
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the emp ID : ");
        int id = sc.nextInt();
        Rest r = new Rest();
        r.setId(id);
        r.setName("Rahul");
        r.setCity("Faridabad");

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(r);

        tx.commit();
        session.close();
        factory.close();
        System.out.println("Project Finished......");
    }
}
