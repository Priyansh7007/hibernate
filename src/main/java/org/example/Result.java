package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Result {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Student student1 = new Student();
        student1.setId(101);
        student1.setName("Priyansh Dubey");
        student1.setCity("Delhi");

        Certificate certificate1 = new Certificate();
        certificate1.setCourse("Java");
        certificate1.setDuration("6 Months");
        student1.setCertificate(certificate1);

        Student student2 = new Student();
        student2.setId(102);
        student2.setName("Harsh Dubey");
        student2.setCity("Faridabad");

        Certificate certificate2 = new Certificate();
        certificate2.setCourse("Android");
        certificate2.setDuration("6 Months");
        student2.setCertificate(certificate2);

        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();

        s.save(student1);
        s.save(student2);
//        s.save(certificate1);
//        s.save(certificate2);

        tx.commit();
        s.close();
        factory.close();
    }
}
