package com.artemsofin.spring.rest;

import com.artemsofin.spring.rest.configuration.MyConfig;
import com.artemsofin.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);
//        Employee empByID = communication.getEmployee(1000);
//        System.out.println(empByID);
//        Employee emp = new Employee("Sveta", "Sokolova",
//                "IT", 900);
//        emp.setId(12);
//        communication.saveEmployee(emp);
        communication.deleteEmployee(12);
    }
}
