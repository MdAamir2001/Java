package com.demo.hibernateDemo;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.demo.hibernateDemo.entities.Category;
import com.demo.hibernateDemo.entities.Employee;
import com.demo.hibernateDemo.entities.Product;
import com.demo.hibernateDemo.entities.Project;
 
public class hibernateUtility {
	private static SessionFactory sessionFactory=getSessionFactory();
	
	public static SessionFactory getSessionFactoryObject() {
		return sessionFactory;
	}
	static SessionFactory getSessionFactory() {
		//create configuration object
		Configuration config=new Configuration();
		//Add entity mapping
//		config.addAnnotatedClass(Product.class);
//		config.addAnnotatedClass(Category.class);
		config.addAnnotatedClass(Employee.class);
		config.addAnnotatedClass(Project.class);


		//Standard registry builder object
		StandardServiceRegistryBuilder ssrb=new StandardServiceRegistryBuilder();
		//load the properties
		Properties properties=config.getProperties();
		//Service registry with properties
		ServiceRegistry serviceRegistry=ssrb.applySettings(properties).build();
		//Create Session Factory
		sessionFactory=config.buildSessionFactory(serviceRegistry);
		return sessionFactory;
	}
	
}