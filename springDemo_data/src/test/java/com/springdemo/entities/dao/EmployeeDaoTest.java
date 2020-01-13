package com.springdemo.entities.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.hibernate.SessionFactory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.springdemo.entities.Employee;

@ContextConfiguration("/springDemo-data-context.xml")
@RunWith(SpringRunner.class)
public class EmployeeDaoTest {
	
	Logger logger = Logger.getLogger(EmployeeDaoTest.class.getName());

	@Autowired
	private EmployeeDao employeeDaoImpl;
	
	@Autowired
	private ComboPooledDataSource datasource;
	
	
	@Autowired
	private SessionFactory sessionFactory;
		

	@Test
	public void dbManagerClassesInitializedTest() {
		assertNotNull(employeeDaoImpl);
		assertNotNull(sessionFactory);
		assertNotNull(datasource);
		
	}
	
	@Test
	public void addEmployeeToDatabaseTest() {
	
	try {
		Employee tempEmployee = new Employee("vincent", "okengwu", "okengwuchidiebere@yahoo.com");
		
		logger.info("Storing employee to database");
		employeeDaoImpl.addEmployee(tempEmployee);
		
		logger.info("Successfully saving employee to the database");
		
	} 
	catch(Exception e) {
		e.printStackTrace();
	}
	
	
	}
	
	
	
		

}
