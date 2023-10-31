package com.demo.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.demo.hibernateDemo.entities.Product;
import com.demo.hibernateDemo.hibernateUtility;

public class App2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = hibernateUtility.getSessionFactory();
        Session session = sessionFactory.openSession();

        Product prdObj = new Product(1,"Java",700);
        Transaction trnx = session.beginTransaction();
        session.save(prdObj);
        trnx.commit();

        Product prdObjRetrieved = session.get(Product.class, 1);
        prdObjRetrieved.setPrdPrice(3900);

        Transaction trnxUpdate = session.beginTransaction();
        session.update(prdObjRetrieved);
        trnxUpdate.commit();

        session.close();
        System.out.println(prdObjRetrieved);
    }
}
