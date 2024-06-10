package com.vti.service;

import com.vti.entity.User;

import java.util.List;

public interface IUserService {
    List<User> findEmployeeByProjectId(int projectId);

    User findByEmailAndPassword(String email, String password);
}
