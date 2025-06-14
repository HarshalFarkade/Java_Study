package streamJava8.programPractise;

import java.util.ArrayList;
import java.util.List;

public class SumOFSalaryOfEmployee {
    public static void main(String[] args) {
        {/* write a program to give sum of salary of employee*/}

        Employee employee1 = new Employee("Harshal",100000.00);
        Employee employee2 = new Employee("Vrushabh",13000.00);
        Employee employee3 = new Employee("Saurabh",90000.00);

        List<Employee> employees= new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        System.out.println("salary of all employee: "+employees.stream().mapToDouble(Employee::getSalary).sum());
    }
}
