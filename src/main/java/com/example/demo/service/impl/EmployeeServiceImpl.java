package com.example.demo.service.impl;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;
import com.example.demo.mapper.EmployeeMapper;
import com.example.demo.mapper.impl.EmployeeMapperImpl;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.EmployeeRepositoryReflect;
import com.example.demo.repository.impl.EmployeeRepositoryImpl;
import com.example.demo.service.EmployeeService;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeServiceImpl implements EmployeeService {

    // create instance of StudentRepositoryImpl --> not work
    EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
    EmployeeMapper employeeMapper = new EmployeeMapperImpl();
    // StudentService >>> StudentRepository
    // instead of create instance -> create instance somewhere , inject to class depended
    EmployeeRepositoryReflect employeeRepository1 = new EmployeeRepositoryReflect(Employee.class);

    @Override
    public List<EmployeeDto> findAll() {
        List<Employee> employees = employeeRepository1.findAll();
//        // mapping list entity -> dto
//        List<StudentDto> studentDtos = new ArrayList<>();
//        for(Student s : students){
//            StudentDto dto  = studentMapper.entityToDto(s);
//            studentDtos.add(dto);
//        }
//        return studentDtos;
        // lambda function
        return employees.stream()
                .map(employeeMapper::entityToDto)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strs = Arrays.asList("sfdsfd","sfsfsd","sgsdgdsg");
//        for(String s : strs){
//            System.err.println(s);
//        }
        // -> lambda
        strs.forEach(System.err::println);


        List<Employee> employees = new ArrayList<>();
        // get all name of student -> to list <String>

        List<String> strName = new ArrayList<>();
        for (Employee s : employees){
            strName.add(s.getName());
        }
        List<String> strName1 = employees.stream().map(Employee::getName).collect(Collectors.toList());





    }


    @Override
    public EmployeeDto getById(Long id) {
        Optional<List<Employee>> optionalStudents =  employeeRepository.getById(String.valueOf(id));
        if(optionalStudents.isPresent()){
            List<Employee> employees = optionalStudents.get();
            if(!CollectionUtils.isEmpty(employees)){
                return employeeMapper.entityToDto(employees.get(0));
            }
        }
        return null;
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }
}
