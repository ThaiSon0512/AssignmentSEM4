package com.example.demo.repository;

import com.example.demo.entity.Employee;
import com.example.demo.jpaRepository.main.impl.JpaExecutorImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryReflect extends JpaExecutorImpl<Employee> {

    public EmployeeRepositoryReflect(Class<Employee> clazz) {
        super(clazz);
    }

    public static void main(String[] args) {
        EmployeeRepositoryReflect repo = new EmployeeRepositoryReflect(Employee.class);
        repo.findAll();
    }

    @Override
    public List<Employee> rowMapper(ResultSet rs) {
        List<Employee> employees = new ArrayList<>();
        try {
            while (rs.next()) {
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
        return employees;
    }

}
