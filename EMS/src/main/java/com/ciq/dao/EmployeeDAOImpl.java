package com.ciq.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ciq.dto.Employee;
import com.ciq.queries.EmployeeQueries;
import com.ciq.util.ConnectionUtil;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public void add(Employee employee) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(EmployeeQueries.EMP_INSERT_QUERY);
			preparedStatement.setInt(1, employee.getEid());
			preparedStatement.setString(2, employee.getEname());
			preparedStatement.setDouble(3, employee.getEsal());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, preparedStatement);
		}

	}

	@Override
	public void update(Employee employee) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(EmployeeQueries.EMP_UPDATE_QUERY);
			preparedStatement.setInt(3, employee.getEid());
			preparedStatement.setString(1, employee.getEname());
			preparedStatement.setDouble(2, employee.getEsal());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, preparedStatement);
		}

	}

	@Override
	public void deleteById(int eid) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(EmployeeQueries.EMP_DELETE_BY_ID_QUERY);
			preparedStatement.setInt(1, eid);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, preparedStatement);
		}

	}

	@Override
	public Employee findById(int eid) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(EmployeeQueries.EMP_FIND_BY_ID_QUERY);
			preparedStatement.setInt(1, eid);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				Employee employee = new Employee();
				employee.setEid(resultSet.getInt(1));
				employee.setEname(resultSet.getString(2));
				employee.setEsal(resultSet.getDouble(3));
				return employee;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, preparedStatement);
		}
		return null;

	}

	@Override
	public List<Employee> findAll() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			List<Employee> employees = new ArrayList<>();
			connection = ConnectionUtil.getConnection();
			preparedStatement = connection.prepareStatement(EmployeeQueries.EMP_FIND_ALL_QUERY);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Employee employee = new Employee();
				employee.setEid(resultSet.getInt(1));
				employee.setEname(resultSet.getString(2));
				employee.setEsal(resultSet.getDouble(3));
				employees.add(employee);
			}

			return employees;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, preparedStatement);
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.println(new EmployeeDAOImpl().findAll());
	}

}
