package com.createiq.sms.service;

import java.util.List;

import com.createiq.sms.model.Student;

public interface StudentService {
	public void add(Student student);

	public void update(Student student);

	public void deleteById(Integer sid);

	public Student findById(Integer sid);

	public List<Student> findAll();
}
