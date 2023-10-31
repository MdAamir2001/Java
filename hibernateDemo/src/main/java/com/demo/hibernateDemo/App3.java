package com.demo.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import com.demo.hibernateDemo.hibernateUtility;

public class App3 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = hibernateUtility.getSessionFactory();
        Session session = sessionFactory.openSession();

        Query<Object[]> query = session.createQuery("select p.prdId, p.prdName from Product p where p.prdCategory=?1");
        query.setParameter(1, "Toy");
        java.util.List<Object[]> products = query.getResultList();

        for (Object[] prd : products) {
            for (Object o : prd) {
                System.out.println(o);
            }
        }

        session.close();
    }
}
