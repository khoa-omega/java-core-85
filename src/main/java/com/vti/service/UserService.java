package com.vti.service;

import com.vti.entity.User;
import com.vti.repository.IUserRepository;
import lombok.AllArgsConstructor;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor
public class UserService implements IUserService {
    private IUserRepository repository;

    @Override
    public List<User> findEmployeeAndManagerByProjectId(int projectId) {
        try {
            return repository.findEmployeeAndManagerByProjectId(projectId);
        } catch (SQLException | IOException exception) {
            return List.of();
        }
    }

    @Override
    public User findAdminByEmailAndPassword(String email, String password) {
        try {
            return repository.findAdminByEmailAndPassword(email, password);
        } catch (SQLException | IOException exception) {
            return null;
        }
    }

    @Override
    public int createEmployee(String fullName, String email) {
        try {
            return repository.createEmployee(fullName, email);
        } catch (SQLException | IOException exception) {
            return 0;
        }
    }
}
