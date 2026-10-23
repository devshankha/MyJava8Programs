package org.example;

import java.util.function.BiConsumer;

import static org.example.Employee.updateEmployee;
//Update an object using a supplied value
//Scenario: A reusable update method lets callers choose which property to change.

class Employee {
    private String department;
    private String location;

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    static void updateEmployee(
            Employee employee,
            String value,
            BiConsumer<Employee, String> updater) {

        updater.accept(employee, value);
    }
}



public class BiConsumer2 {

    public static void main(String[] args) {
        Employee employee = new Employee();

        updateEmployee(employee, "Engineering", Employee::setDepartment);
        updateEmployee(employee, "Bengaluru", Employee::setLocation);

    }
}
