package se.iths.kattis.labb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.kattis.labb1.model.Project;
import se.iths.kattis.labb1.service.ProjectService;

@Controller
public class ProjectController {
    private final ProjectService projectService;

    private Project project;

    public ProjectController(ProjectController projectController) {
        this.projectService = projectService;
    }

    @GetMapping("/projects")
    public String getProjects(Model model) {
        model.addAttribute("projects", projectService.getAllProjects());
                return "projects";
    }
}
