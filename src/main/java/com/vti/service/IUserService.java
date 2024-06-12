package com.vti.service;

import com.vti.entity.User;

import java.util.List;

public interface IUserService {
    List<User> findEmployeeAndManagerByProjectId(int projectId);

    User findAdminByEmailAndPassword(String email, String password);

    int createEmployee(String fullName, String email);
}
