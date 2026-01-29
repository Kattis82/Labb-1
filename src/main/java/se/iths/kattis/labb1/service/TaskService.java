package se.iths.kattis.labb1.service;

import org.springframework.stereotype.Service;
import se.iths.kattis.labb1.model.Task;

import java.util.List;

@Service
public class TaskService {


    public List<Task> getAllTasks() {
        return List.of(
                new Task("Labb 1", "Skapa en applikation", "medium"),
                new Task("Projekt 1", "Bygga en webbshop", "high"),
                new Task("Labb 2", "Koppla applikation till en databas", "medium")
        );
    }

}
