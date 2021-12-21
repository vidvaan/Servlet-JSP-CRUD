package com.createiq.sms.dao;

import java.util.List;

import com.createiq.sms.model.Student;

public interface StudentDAO {
	public void add(Student student);
	public void update(Student student);
	public void deleteById(Integer sid);
	public Student findById(Integer sid);
	public List<Student> findAll();
}
