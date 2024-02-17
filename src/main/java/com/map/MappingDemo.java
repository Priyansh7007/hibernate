package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MappingDemo {
    public static void main(String[] args) {
        System.out.println("Project Started....");
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Emp emp1 = new Emp();
        emp1.setEid(1);
        emp1.setName("Harsh");

        Project p = new Project();
        p.setPid(11);
        p.setProjectName("Tic Toc Toe");
        p.setEmp(emp1);

        Project p1 = new Project();
        p1.setPid(12);
        p1.setProjectName("Chat Application");
        p1.setEmp(emp1);

        Project p2 = new Project();
        p2.setPid(12);
        p2.setProjectName("Ludo");
        p2.setEmp(emp1);

        List<Project> projectList = new ArrayList<>();
        projectList.add(p);
        projectList.add(p1);
        projectList.add(p2);

        emp1.setProjects(projectList);


        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        
        session.save(emp1);
        session.save(p);
        session.save(p1);
        session.save(p2);
        
        transaction.commit();
        session.close();
        factory.close();
    }

}
