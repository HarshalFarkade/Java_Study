package streamJava8.programPractise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindMaxSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Harshal", 100000.0, "IT"),
                new Employee("Vrushabh", 13000.0, "HR"),
                new Employee("Saurabh", 90000.0, "IT"),
                new Employee("Komal", 12000.0, "HR"),
                new Employee("Ameya", 95000.0, "Finance")
        );


        Optional<Employee> highestSalary= employees.stream().max(Comparator.comparingDouble(Employee::getSalary));
        if (highestSalary.isPresent()){
            System.out.println("Employees with highest salary  "+highestSalary.get());
        }else {
            System.out.println("No employee found");
        }
    }
}
