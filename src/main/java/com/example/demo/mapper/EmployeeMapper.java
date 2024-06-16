package com.example.demo.mapper;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;

public interface EmployeeMapper {
    Employee dtoToEntity(EmployeeDto dto);
    EmployeeDto entityToDto(Employee entity);
}
