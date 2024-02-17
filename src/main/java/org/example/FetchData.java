package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

//        StudentAddress ad = (StudentAddress)session.get(StudentAddress.class,1);
//        System.out.println(ad.getCity());

        session.close();
        factory.close();
    }
}
