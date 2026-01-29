package se.iths.kattis.labb1.service;

import org.springframework.stereotype.Service;
import se.iths.kattis.labb1.model.Role;

import java.util.List;

@Service
public class RoleService {
    public List<Role> getAllRoles() {
        return List.of(
                new Role(1, "Admin", "Full access in the system"),
                new Role(2, "Manager", "Has system settings access, but limited"),
                new Role(3, "Employee", "Can view and participate in meetings assigned")
        );
    }
}
