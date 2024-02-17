package org.OneTo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        System.out.println("Project Started......");
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        EmpD em = new EmpD();
        em.setId(11);
        em.setName("Rahul");
        em.setCity("Faridabad");



        EmpWork ew = new EmpWork();
        ew.setId(111);
        ew.setWork("Java Developer");
        ew.setEmpD(em);

        em.setEmpWork(ew);

        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        try{
            session.persist(em);
            session.persist(ew);
        }catch (Exception e){
            System.out.println("there have some exception : "+e);
        }

        t.commit();
        session.close();
        factory.close();
        System.out.println("Project finished......");
    }
}
