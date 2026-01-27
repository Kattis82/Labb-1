package se.iths.kattis.labb1.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.kattis.labb1.model.Department;

import java.util.List;

@Controller
public class DepartmentController {

    @GetMapping("/departments")
    public String showDepartments(Model model) {

        List<Department> departments = List.of(
                new Department(1, "IT", "Stockholm"),
                new Department(2, "HR", "Gothenburg"),
                new Department(3, "Finance", "Malmö")
        );

        model.addAttribute("departments", departments);

        return "departments";
    }
}

