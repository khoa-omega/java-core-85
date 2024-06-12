package com.vti.controller;

import com.vti.entity.User;
import com.vti.service.IUserService;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class UserController {
    private IUserService service;

    public List<User> findEmployeeAndManagerByProjectId(int projectId) {
        return service.findEmployeeAndManagerByProjectId(projectId);
    }

    /**
     * @param email    Email của admin
     * @param password Mật khẩu của admin
     * @return Thông tin admin tương ứng với email và password,
     * hoặc null nếu đăng nhập thất bại
     */
    public User findAdminByEmailAndPassword(String email, String password) {
        return service.findAdminByEmailAndPassword(email, password);
    }

    public int createEmployee(String fullName, String email) {
        return service.createEmployee(fullName, email);
    }
}
