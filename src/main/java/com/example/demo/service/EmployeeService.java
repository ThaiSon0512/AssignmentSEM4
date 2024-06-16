package com.example.demo.service;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    EmployeeDto getById(Long id);
    List<EmployeeDto> findAll();
    Employee save(Employee employee);
}
