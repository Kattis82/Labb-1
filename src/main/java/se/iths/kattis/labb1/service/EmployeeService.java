package se.iths.kattis.labb1.service;

import org.springframework.stereotype.Service;
import se.iths.kattis.labb1.model.Employee;

import java.util.List;

@Service
public class EmployeeService {

    public List<Employee> getAllEmployees() {
        return List.of(
                new Employee("Kattis", "Calmvik", "Controller"),
                new Employee("Johanna", "Viipa", "Javautvecklare"),
                new Employee("Karin", "Karlsson", "Projektledare")
        );
    }
}
