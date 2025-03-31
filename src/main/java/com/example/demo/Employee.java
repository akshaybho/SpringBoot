package com.example.demo;

public class Employee {

    private String empName;
    private int empId;

    public Employee(String empName, int empId) {
        this.empName = empName;
        this.empId = empId;
    }

    @Override
    public String toString() {
        return empName+"\n"+empId;
    }
}
