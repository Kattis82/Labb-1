package se.iths.kattis.labb1.service;

import org.springframework.stereotype.Service;
import se.iths.kattis.labb1.model.User;

import java.util.List;

@Service
public class UserService {


    public List<User> getAllUsers() {
        return List.of(
                new User("kalu11", "1234", "kattiscalmvik@outlook.com"),
                new User("jovi04", "5678", "johannaviipa@iths.se"),
                new User("kaka22", "1122", "karinkarlsson@gmail.se")
        );
    }
}
