package streamJava8.programPractise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.*;

public class FindMax_salary_All_Department {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Harshal", 100000.0, "IT"),
                new Employee("Vrushabh", 13000.0, "HR"),
                new Employee("Saurabh", 90000.0, "IT"),
                new Employee("Komal", 12000.0, "HR"),
                new Employee("Ameya", 95000.0, "Finance")
        );

        Map<String, Optional<Employee>> result = employees.stream().collect(groupingBy(
                Employee::getDepartment,
                reducing((e1,e2)->e1.getSalary()>e2.getSalary()?e1:e2)
        ))
                .entrySet()
                .stream()
                .filter(e-> e.getValue() != null)
                .collect(toMap(Map.Entry::getKey,Map.Entry::getValue));

        result.forEach((dept,emp)-> System.out.println("dept"+ dept+ "emp"+emp));
    }
}