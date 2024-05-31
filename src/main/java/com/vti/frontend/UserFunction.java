package com.vti.frontend;

import com.vti.entity.User;
import com.vti.repository.UserRepository;
import com.vti.util.ScannerUtil;
import lombok.AllArgsConstructor;

import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor
public class UserFunction {
    private UserRepository repository;

    public void findAll() throws SQLException {
        List<User> users = repository.findAll();
        System.out.println("Danh sách users:");
        System.out.println("+------+--------------------+--------------------+");
        System.out.println("|  ID  |     FULL NAME      |       EMAIL        |");
        System.out.println("+------+--------------------+--------------------+");
        if (users.isEmpty()) {
            System.out.printf("| %-4s | %-18s | %-18s |%n", "NULL", "NULL", "NULL");
            System.out.println("+------+--------------------+--------------------+");
        } else {
            for (User user : users) {
                int id = user.getId();
                String fullName = user.getFullName();
                String email = user.getEmail();
                System.out.printf("| %-4s | %-18s | %-18s |%n", id, fullName, email);
                System.out.println("+------+--------------------+--------------------+");
            }
        }
    }

    public void findById() throws SQLException {
        System.out.println("Nhập vào id cần tìm:");
        int id = ScannerUtil.inputInt();
        User user = repository.findById(id);
        System.out.println("+------+--------------------+--------------------+");
        System.out.println("|  ID  |     FULL NAME      |       EMAIL        |");
        System.out.println("+------+--------------------+--------------------+");
        if (user == null) {
            System.out.printf("| %-4s | %-18s | %-18s |%n", "NULL", "NULL", "NULL");
            System.out.println("+------+--------------------+--------------------+");
        } else {
            String fullName = user.getFullName();
            String email = user.getEmail();
            System.out.printf("| %-4s | %-18s | %-18s |%n", id, fullName, email);
            System.out.println("+------+--------------------+--------------------+");
        }
    }
}
