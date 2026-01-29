package se.iths.kattis.labb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.kattis.labb1.service.RoleService;

@Controller
@RequestMapping("/")
public class RoleController {
    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    public String getRoles(Model model) {
        model.addAttribute("roles", roleService.getAllRoles());
        return "roles";
    }
}
