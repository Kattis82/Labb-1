package se.iths.kattis.labb1.service;

import org.springframework.stereotype.Service;
import se.iths.kattis.labb1.model.Project;

import java.util.List;

@Service
public class ProjectService {
    public List<Project> getAllProjects() {
        return List.of(
                new Project("Spring-boot", "Skapa en applikation", "(2026-01-14)"),
                new Project("Grupparbeta", "Att jobba på applikation", "(2026-01-15"),
                new Project("Byggaprojekt", "Skapa en projekt", "(2026-01-19")
        );
    }
}
