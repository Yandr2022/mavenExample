package by.Yandr2022.SBJavaCourse;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Employee employee = new Employee("Yuli", 100000,new Date());
        System.out.println(employee);
        employee.setName("Yandr2022");
        System.out.println(employee.getName());
        employee.setWorkStart(null);
    }
}
