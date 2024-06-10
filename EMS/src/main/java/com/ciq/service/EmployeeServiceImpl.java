package com.ciq.service;

import java.util.List;

import com.ciq.dao.EmployeeDAO;
import com.ciq.dao.EmployeeDAOImpl;
import com.ciq.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeDAO employeeDAO = new EmployeeDAOImpl();

	@Override
	public void add(Employee employee) {
        employeeDAO.add(employee);		
	}

	@Override
	public void update(Employee employee) {
		employeeDAO.update(employee);	
	}

	@Override
	public void deleteById(int eid) {
		employeeDAO.deleteById(eid);	
		
	}

	@Override
	public Employee findById(int eid) {
		return employeeDAO.findById(eid);
	}

	@Override
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}

}
