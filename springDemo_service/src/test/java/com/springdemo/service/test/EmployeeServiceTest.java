package com.springdemo.service.test;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import static org.mockito.Mockito.*;

import com.springdemo.employee.service.EmployeeService;
import com.springdemo.entities.Employee;

@ContextConfiguration("classpath:/springDemo-service-context.xml")
@RunWith(SpringRunner.class)
public class EmployeeServiceTest {
	
	
	@Mock
	private EmployeeService employeeService;
	

	@Before
	public void setUp() throws Exception {
		
		employeeService = mock(EmployeeService.class);
	}

	@Test
	public void test() {
		assertNotNull(employeeService);;
	}

	
	@Test
	public void addEmployeeTest() {
	
		Employee employee = new Employee("Peter", "brand","peter@gmail.com");
		
		doNothing().when(employeeService).addEmployee(isA(Employee.class));
		employeeService.addEmployee(employee);
		
		verify(employeeService, times(1)).addEmployee(employee);
	}

}
