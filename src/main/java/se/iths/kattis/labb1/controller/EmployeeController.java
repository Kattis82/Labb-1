package se.iths.kattis.labb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.kattis.labb1.service.EmployeeService;

@Controller
@RequestMapping("/")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping("/employees")
    public String getEmployees(Model model) {
        model.addAttribute("employees", userService.getAllUsers());
        return "employees";
    }
}
