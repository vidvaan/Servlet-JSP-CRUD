package com.createiq.sms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.createiq.sms.model.Student;
import com.createiq.sms.queries.Queries;
import com.createiq.util.ConnectionUtil;

public class StudentDAOImpl implements StudentDAO{
	
	public void add(Student student) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(Queries.STU_INSERT);
		    preparedStatement.setInt(1, student.getSid());
		    preparedStatement.setString(2, student.getSname());
		    preparedStatement.setDouble(3, student.getSfee());
		    preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void update(Student student) {
		
	}

	public void deleteById(Integer sid) {
		
	}

	public Student findById(Integer sid) {
		return null;
	}

	public List<Student> findAll() {
		return null;
	}

}
