package com.artemsofin.spring.springboot.mod8_1.dao;



import com.artemsofin.spring.springboot.mod8_1.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    public List<Employee> findAllByName(String name);
}
