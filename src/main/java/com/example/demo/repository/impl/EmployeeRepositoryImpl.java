package com.example.demo.repository.impl;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.utils.ConnectionPool;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private static final String SQL_QUERY_EMPLOYEE_BY_ID = "Select * from employee where id  = ?";

    @Override
    public Optional<List<Employee>> getById(String id) {
//        Connection connection = DatabaseHelper.getConnection();
        List<Employee> employees = new ArrayList<>();
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        Connection con = connectionPool.getConnection();
        try {
            // fixme  : sql injection
            PreparedStatement pt = con.prepareStatement(SQL_QUERY_EMPLOYEE_BY_ID);
            pt.setString(1,String.valueOf(id));
            ResultSet rs = pt.executeQuery();
//
            while (rs.next()){
                Employee s = new Employee();
                s.setId(rs.getLong("id"));
                s.setName(rs.getString("name"));
                s.setVitri(rs.getString("vitri"));
                s.setBhxh(rs.getString("bhxh"));
                s.setSalary(rs.getString("salary"));
                s.setNetsalary(rs.getString("netsalary"));
                s.setAddress(rs.getString("address"));
                s.setDob(rs.getString("dob"));
                employees.add(s);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return  Optional.of(employees);
    }

    @Override
    public List<Employee> getAll() {
        return List.of();
    }

    @Override
    public Employee save(Employee employee) {

        return null;
    }
    // extend vs implement
}
