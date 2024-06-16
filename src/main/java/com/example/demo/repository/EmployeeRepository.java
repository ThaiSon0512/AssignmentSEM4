package com.example.demo.repository;

import com.example.demo.entity.Employee;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;



import java.util.List;
import java.util.Optional;

public interface EmployeeRepository {
    /**
     *
     * @param id : String
     * @return : list Dto query in table with id  =  ????
     */
    Optional<List<Employee>> getById(String id);
    List<Employee> getAll();

    Employee save(Employee employee);
}
