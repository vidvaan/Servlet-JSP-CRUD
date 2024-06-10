package com.ciq.service;

import java.util.List;

import com.ciq.dto.Employee;

public interface EmployeeService {
	 public void add(Employee employee);
	 public void update(Employee employee);
	 public void deleteById(int eid);
	 public Employee findById(int  eid);
     public List<Employee> findAll();
}