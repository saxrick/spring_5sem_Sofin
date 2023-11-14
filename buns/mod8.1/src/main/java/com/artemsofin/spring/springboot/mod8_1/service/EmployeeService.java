package com.artemsofin.spring.springboot.mod8_1.service;




import com.artemsofin.spring.springboot.mod8_1.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);

    public List<Employee> findAllByName(String name);

}
