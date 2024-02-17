package org.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Scanner;

public class History {
    public static void main(String[] args) {
        System.out.println("Project Started");
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

//        Company com = new Company();
//        com.setId(1);
//        com.setName("Harsh");
//        com.setCity("Sonbhadra");
//
//        Company com1 = new Company();
//        com1.setId(2);
//        com1.setName("Faizan");
//        com1.setCity("Baharaich");
//
//        Company com2 = new Company();
//        com2.setId(3);
//        com2.setName("Vipin");
//        com2.setCity("Mirzapur");
//
//        Company com3 = new Company();
//        com3.setId(4);
//        com3.setName("Shyam");
//        com3.setCity("Lucknow");
//
//        Company com4 = new Company();
//        com4.setId(5);
//        com4.setName("Ram");
//        com4.setCity("Delhi");
//
//        Company com5 = new Company();
//        com5.setId(6);
//        com5.setName("Rahul");
//        com5.setCity("Sonbhadra");

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();


        try {
//            session.save(com);
//            session.save(com1);
//            session.save(com2);
//            session.save(com3);
//            session.save(com4);
//            session.save(com5);
//            String query = "from Company where city=:x";
//            Query q = session.createQuery(query);
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Enter the city Name : ");
//            String city = sc.next();
//            q.setParameter("x",city);
//
//            List<Company> list = q.list();
//            for (Company company: list) {
//                System.out.println(company.getName()+" : "+company.getCity());
//            }
//            System.out.println("-----------------------Delete Query------------------------");
//
//            Query query = session.createQuery("delete from Company s where city='Delhi'");
//            int r = query.executeUpdate();
//            System.out.println("Deleted");
//            System.out.println(r);
            System.out.println("-----------------------Update Query------------------------");
            Query query = session.createQuery("update Company set city='Rohatak' where name = 'Harsh' ");
            int r =  query.executeUpdate();
            System.out.println(r+" Objects Updataed..");


        }catch (Exception e){
            System.out.println("There have some Exception : "+e);
        }

        tx.commit();
        session.close();
        factory.close();
        System.out.println("Project Done.....");
    }
}
