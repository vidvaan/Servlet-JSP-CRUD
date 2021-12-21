package com.createiq.sms.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.createiq.sms.model.Student;
import com.createiq.sms.util.SessionUtil;

public class StudentDAOImpl implements StudentDAO {

	public void add(Student student) {
			Session session = SessionUtil.getSession();
			session.save(student);
			session.beginTransaction().commit();
			SessionUtil.close(session);
	}

	public void update(Student student) {
		Session session = SessionUtil.getSession();
		session.update(student);
		session.beginTransaction().commit();
		SessionUtil.close(session);
	}

	public void deleteById(Integer sid) {
		Session session = SessionUtil.getSession();
		Student student = new Student();
		student.setSid(sid);
		session.delete(student);
		session.beginTransaction().commit();
		SessionUtil.close(session);
	}

	public Student findById(Integer sid) {
		Session session = SessionUtil.getSession();
		Student student = session.get(Student.class, sid);
		return student;
	}

	public List<Student> findAll() {
		Query<Student> query = SessionUtil.getSession().createQuery("from Student");
		return query.list();
	}
	
	
	public static void main(String[] args) {
		StudentDAOImpl studentDAOImpl = new StudentDAOImpl();
		//studentDAOImpl.deleteById(1001);
		
//		Student student = new Student(1001, "Ram", 40000.00);
//		studentDAOImpl.add(student);
		
//		System.out.println(studentDAOImpl.findById(1001));
		
		System.out.println(studentDAOImpl.findAll());
	}

	

}
