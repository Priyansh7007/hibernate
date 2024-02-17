package org.map1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MappingDemo {
    public static void main(String[] args) {
        System.out.println("Project Started");
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Emp e1 = new Emp();
        Emp e2 = new Emp();

        e1.setEid(34);
        e1.setName("Ram");

        e2.setEid(35);
        e2.setName("Shyam");

        Project p1 = new Project();
        Project p2 = new Project();

        p1.setPid(12121);
        p1.setProjectName("Library Management System");

        p2.setPid(14214);
        p2.setProjectName("ChatBot");

        List<Emp> list1 = new ArrayList<>();
        List<Project> list2 = new ArrayList<>();

        list1.add(e1);
        list1.add(e2);

        list2.add(p1);
        list2.add(p2);

        e1.setProjects(list2);
        p2.setEmps(list1);

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        try {
        session.save(e1);
        session.save(e2);
        session.save(p1);
        session.save(p2);
        }
        catch (Exception e){
            System.out.println("There have some Exceptions : "+e);
        }

        tx.commit();
        session.close();
        factory.close();
        System.out.println("Done...");
    }
}
