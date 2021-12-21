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
		studentDAO.update(student);
	}

	public void deleteById(Integer sid) {
		studentDAO.deleteById(sid);
		
	}

	public Student findById(Integer sid) {
		return studentDAO.findById(sid);
	}

	public List<Student> findAll() {
		return studentDAO.findAll();
	}

}
