package org.example;

import org.example.configuration.MyConfig;
import org.example.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.servlet.support.JstlUtils;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);
//        List<Employee>  allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee empByOd = communication.getEmployee(2);
//        System.out.println(empByOd);

//        Employee emp = new Employee("Svetlana", "Sokolova", "IT", 12000);
//        emp.setId(10);
//
//        communication.saveEmployee(emp);

        communication.deleteEmployee(10);
    }
}
