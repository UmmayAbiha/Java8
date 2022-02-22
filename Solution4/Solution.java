package com.java8Practise;

//WAP using java 8:
//    Given a list of objects of following class:
//           class Employee{
//           String fullName;
//           Long salary;
//           String city;
//           }
//
//          Get list of all unique firstNames of employees where their salary is less than 5000 and who live in delhi.
//          Note: Full name is concatenation of first name, middle name and last name with single space in between.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    String fullname;
    Long salary;
    String city;

    Employee(String fullname,Long salary, String city){
        this.fullname = fullname;
        this.salary = salary;
        this.city = city;
    }

    public String getFullname() {
        return fullname;
    }

    public Long getSalary() {
        return salary;
    }

    public String getCity() {
        return city;
    }
}
public class Solution{
    public static void main(String[] args) {

        Employee emp1 = new Employee( "Ummay Abiha", 567800l, "Lucknow");
        Employee emp2 = new Employee( "Komal Rawat", 568l, "Delhi");
        Employee emp3 = new Employee( "Sadiya Khatoon", 89000l, "Amritsar");
        Employee emp4 = new Employee( "Aamna Akhtar", 124567l, "Patna");
        Employee emp5 = new Employee( "Ashar khan", 78906l, "Delhi");
        Employee emp6 = new Employee( "Ayesha Sharma", 780000l, "Bareilly");
        Employee emp7 = new Employee( "Shreya Saxena", 88800l, "Hyderabad");

        List<Employee> emp = Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6,emp7);

        System.out.println(emp.stream()
                .filter(salary -> salary.getSalary()< 5000)
                .filter(city -> city.getCity().equals("Delhi"))
                .map(name -> name.getFullname().split(" ")[0]).distinct()
                .collect(Collectors.toList()));
    }
}
