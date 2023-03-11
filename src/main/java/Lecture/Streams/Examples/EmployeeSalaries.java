package Lecture.Streams.Examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSalaries {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 50000));
        employees.add(new Employee("Emily", 75000));
        employees.add(new Employee("David", 60000));
        employees.add(new Employee("Sarah", 80000));
        employees.add(new Employee("Mark", 55000));

        int minSalary = 65000;
        List<Employee> highSalaryEmployees = employees.stream()
                .filter(e -> e.getSalary() > minSalary)
                .collect(Collectors.toList());

        System.out.println("Employees with salary above " + minSalary + ": " + highSalaryEmployees);
    }
}

class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
