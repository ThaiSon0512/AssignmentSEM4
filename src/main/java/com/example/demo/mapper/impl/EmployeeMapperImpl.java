package com.example.demo.mapper.impl;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;
import com.example.demo.mapper.EmployeeMapper;
import org.springframework.beans.BeanUtils;


public class EmployeeMapperImpl implements EmployeeMapper {
    @Override
    public Employee dtoToEntity(EmployeeDto dto) {
        Employee employee = new Employee();
        BeanUtils.copyProperties(dto, employee);
        return employee;
    }

    @Override
    public EmployeeDto entityToDto(Employee entity) {
        EmployeeDto dto = new EmployeeDto();
        BeanUtils.copyProperties(entity,dto);
        return dto;
    }
}
