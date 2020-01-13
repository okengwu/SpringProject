package com.springdemo.entities.dao;

import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springdemo.entities.Employee;

@Repository
public  class EmployeeDaoImple implements EmployeeDao {
	
	private Logger logger = Logger.getLogger(EmployeeDaoImple.class.getName());

	@Autowired
	private SessionFactory sessionFactory;
	
//	@Autowired
//	private Session currentSession;
	
	@Transactional
	public void addEmployee(Employee employee) {
	
	logger.info("getting current trasaction");
	Session currentSession = sessionFactory.getCurrentSession();
	
//	logger.info("starting a transaction");
//	currentSession.beginTransaction();
	
	logger.info("saving employee in the database" + employee.toString());
	currentSession.save(employee);
	
//	logger.info("Succesful, commiting transaction");
//	currentSession.getTransaction().commit();
	}


	public void getEmployee() {
	
		
	}

	
//	Data Access Object Pattern or DAO pattern is used to separate low level data accessing API or operations from high level business services. Following are the participants in Data Access Object Pattern.
//
//	Data Access Object Interface - This interface defines the standard operations to be performed on a model object(s).
//
//	Data Access Object concrete class - This class implements above interface. This class is responsible to get data from a data source which can be database / xml or any other storage mechanism.
//
//	Model Object or Value Object - This object is simple POJO containing get/set methods to store data retrieved using DAO class.
//	
//	Data Access Object Interface - This interface defines the standard operations to be performed on a model object(s).

//Data Access Object concrete class - This class implements above interface. This class is responsible to get data from a data source which can be database / xml or any other storage mechanism.
//
//Model Object or Value Object - This object is simple POJO containing get/set methods to store data retrieved using DAO class
//	
	

}
