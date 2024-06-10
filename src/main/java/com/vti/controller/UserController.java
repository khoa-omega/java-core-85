package com.vti.controller;

import com.vti.entity.User;
import com.vti.service.IUserService;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class UserController {
    private IUserService service;

    public List<User> findEmployeeByProjectId(int projectId) {
        return service.findEmployeeByProjectId(projectId);
    }

    /**
     * @param email    Email của user
     * @param password Mật khẩu của user
     * @return Thông tin user tương ứng với email và password,
     * hoặc null nếu đăng nhập thất bại
     */
    public User findByEmailAndPassword(String email, String password) {
        return service.findByEmailAndPassword(email, password);
    }
}
