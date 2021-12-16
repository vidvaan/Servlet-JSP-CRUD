package com.createiq.sms.service;

import java.util.List;

import com.createiq.sms.dao.StudentDAO;
import com.createiq.sms.dao.StudentDAOImpl;
import com.createiq.sms.model.Student;

public class StudentServiceImpl implements StudentService{
	
	private StudentDAO studentDAO = new StudentDAOImpl();

	public void add(Student student) {
		 studentDAO.add(student);
	}

	public void update(Student student) {
		// TODO Auto-generated method stub
		
	}

	public void deleteById(Integer sid) {
		// TODO Auto-generated method stub
		
	}

	public Student findById(Integer sid) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
