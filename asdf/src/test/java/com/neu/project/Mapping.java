package com.neu.project;

import org.hibernate.Session;

import com.neu.finalproject.dao.HibernateUtil;
import com.neu.finalproject.model.Employee;
import com.neu.finalproject.model.UserAccount;

public class Mapping {
	
	
	public static void main(String[] args) {
		System.out.println("Hibernate one to one (Annotation)");
		Session session = HibernateUtil.getSessionFactory().openSession();
 
		session.beginTransaction();
 
		Employee employee = new Employee();
		Employee employee1 = new Employee();
		Employee employee2= new Employee();
		Employee employee3 = new Employee();
		Employee employee4 = new Employee(); 
		
		employee.setFirstName("Ram");
		employee.setLastName("P");
		employee.setAge(29);
		employee.setCity("Boston");
		employee.setEmail("ramP@gmail.com");
		employee.setPhNum("123456789");
		
		employee1.setFirstName("ramDoc");
		employee1.setLastName("Doc");
		employee1.setAge(25);
		employee1.setCity("Boston");
		employee1.setEmail("ramDoc@gmail.com");
		employee1.setPhNum("987545653");
		
		employee2.setFirstName("ramNurse");
		employee2.setLastName("Nurse");
		employee2.setAge(25);
		employee2.setCity("Boston");
		employee2.setEmail("ramNurse@gmail.com");
		employee2.setPhNum("634832489");
		
		employee3.setFirstName("ramLabAsst");
		employee3.setLastName("LabAsst");
		employee3.setAge(25);
		employee3.setCity("Boston");
		employee3.setEmail("ramLabAsst@gmail.com");
		employee3.setPhNum("623497324");
		
		employee4.setFirstName("ramPharmacist");
		employee4.setLastName("PH");
		employee4.setAge(23);
		employee4.setCity("Boston");
		employee4.setEmail("ramPharmacist@gmail.com");
		employee4.setPhNum("123456789");
 
		UserAccount userAccount = new UserAccount();
		userAccount.setUserName("admin");
		userAccount.setPassword("admin");
		userAccount.setRole("admin");
		
		UserAccount userAccount1 = new UserAccount();
		userAccount1.setUserName("ramDoc");
		userAccount1.setPassword("ramDoc");
		userAccount1.setRole("doctor");
		
		UserAccount userAccount2 = new UserAccount();
		userAccount2.setUserName("ramNurse");
		userAccount2.setPassword("ramNurse");
		userAccount2.setRole("nurse");
		
		UserAccount userAccount3 = new UserAccount();
		userAccount3.setUserName("ramLabAsst");
		userAccount3.setPassword("ramLabAsst");
		userAccount3.setRole("labassistant");


		UserAccount userAccount4 = new UserAccount();
		userAccount4.setUserName("ramPharmacist");
		userAccount4.setPassword("ramPharmacist");
		userAccount4.setRole("pharmacist");
 
		//employee.setUserAccount(userAccount);
		userAccount.setEmployee(employee);
		userAccount1.setEmployee(employee1);
		userAccount2.setEmployee(employee2);
		userAccount3.setEmployee(employee3);
		userAccount4.setEmployee(employee4);
 
		session.save(userAccount);
		session.save(userAccount1);
		session.save(userAccount2);
		session.save(userAccount3);
		session.save(userAccount4);
		session.getTransaction().commit();
 
		System.out.println("Done");
	}

}
