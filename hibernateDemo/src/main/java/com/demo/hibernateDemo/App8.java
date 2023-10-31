package com.demo.hibernateDemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
 
import com.demo.hibernateDemo.hibernateUtility;
import com.demo.hibernateDemo.entities.Employee;
import com.demo.hibernateDemo.entities.Project;
 
public class App8 {
	public static void main(String ar[]) {
		 SessionFactory sessionFactory=hibernateUtility.getSessionFactoryObject();
		 Session session=sessionFactory.openSession();
		 session.beginTransaction();
		 Project prjObj1=new Project("ERP");
		 session.persist(prjObj1);
		 Project prjObj2=new Project("Inventory");
		 session.persist(prjObj2);
		 Employee empObj1=new Employee("Ram", 35000);
		 empObj1.getProjects().add(prjObj1);
		 empObj1.getProjects().add(prjObj2);
		 session.persist(empObj1);
		 Employee empObj=session.get(Employee.class, 1);
		 System.out.println(empObj1);
		 List<Project> projects=empObj1.getProjects();
		 projects.forEach(System.out::println);
//		 Project prjObj=session.get(Project.class, 1);
//		 System.out.println(prjObj);
//		 List<Employee> employees=prjObj.getEmployees();
//		 employees.forEach(System.out::println);
		 session.getTransaction().commit();
		 session.close();
	}
}
