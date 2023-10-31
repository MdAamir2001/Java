package com.demo.hibernateDemo;

import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;

import com.demo.hibernateDemo.entities.Product;
import com.mysql.cj.Session;

import jakarta.transaction.HeuristicMixedException;
import jakarta.transaction.HeuristicRollbackException;
import jakarta.transaction.RollbackException;
import jakarta.transaction.SystemException;
import jakarta.transaction.Transaction;
 
public class App {
  public static void main(String[] args) throws SecurityException, IllegalStateException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
	  SessionFactory sessionFactory=hibernateUtility.getSessionFactoryObject();
		 Session session=(Session) sessionFactory.openSession();
		 Product prdObj=((org.hibernate.Session) session).get(Product.class, 1);
		 session.forceClose();
		 //prdObj is detached
		 prdObj.setPrdPrice(2000);
		 Session session1=(Session) sessionFactory.openSession();
		 Product myObj=((org.hibernate.Session) session1).get(Product.class, 1);//myObj persistant
		 Transaction trnx= (Transaction) ((SharedSessionContract) session1).beginTransaction();
		 ((org.hibernate.Session) session1).merge(prdObj);
		 trnx.commit();
		 session1.forceClose();
		 System.out.println(prdObj);
		 System.out.println(myObj); 
  }
}
