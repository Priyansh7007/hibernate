package org.relation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Demo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        // Creating employee

        employeeDetaile ed = new employeeDetaile();
        ed.setId(1);
        ed.setName("Rahul");
        ed.setCity("delhi");

        System.out.println(ed);
        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();

        s.save(ed);

        tx.commit();
        s.close();
    }
}
