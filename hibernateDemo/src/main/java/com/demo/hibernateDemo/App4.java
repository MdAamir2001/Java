package com.demo.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import java.util.List;
import com.demo.hibernateDemo.hibernateUtility;

public class App4 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = hibernateUtility.getSessionFactory();
        Session session = sessionFactory.openSession();

        Query<Object[]> query = session.createNativeQuery("select prdid, prdname from product where prdcategory=?");
        query.setParameter(1, "Toy");
        List<Object[]> products = query.getResultList();

        for (Object[] p : products) {
            for (Object o : p) {
                System.out.println(o);
            }
        }

        session.close();
    }
}
