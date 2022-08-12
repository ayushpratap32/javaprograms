package com.sample;


import java.util.Objects;

public class Employee {
    private String name;
    private String designation;
    private String city;
    private int salary;

    public Employee(String name, String designation, String city, int salary) {
        this.name = name;
        this.designation = designation;
        this.city = city;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && name.equals(employee.name) && designation.equals(employee.designation) && city.equals(employee.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, designation, city, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", city='" + city + '\'' +
                ", salary=" + salary +
                '}';
    }
}
