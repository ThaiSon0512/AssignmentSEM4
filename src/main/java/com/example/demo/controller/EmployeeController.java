package com.example.demo.controller;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.impl.EmployeeServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    EmployeeService employeeService = new EmployeeServiceImpl();
    @GetMapping(value = "/employee/{employeeId}")
    public EmployeeDto get(@PathVariable Long employeeId){
        return employeeService.getById(employeeId);
    }
    @GetMapping(value = "/employees")
    public List<EmployeeDto> finadall(){
        return employeeService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Object> create(@RequestBody Employee employee) {

        employeeService.save(employee);
        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }

}


