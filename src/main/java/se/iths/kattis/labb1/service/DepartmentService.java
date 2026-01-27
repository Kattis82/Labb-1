package se.iths.kattis.labb1.service;


import org.springframework.stereotype.Service;
import se.iths.kattis.labb1.model.Department;


import java.util.List;

@Service
public class DepartmentService {

    public List<Department> getAllDepartments() {

        return List.of(
                new Department(1, "IT", "Stockholm"),
                new Department(2, "HR", "Gothenburg"),
                new Department(3, "Finance", "Malmö")
        );
    }
}

