package backend;

import entity.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Exercise01 {
    public static void question01() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Huy"));
        students.add(new Student("Long"));
        students.add(new Student("Huy"));
        students.add(new Student("Uyên"));
        students.add(new Student("Huy"));
        students.add(new Student("Tú"));

//        a) In ra tổng số phần tử của students
        System.out.println(students.size());

//        b) Lấy phần tử thứ 4 của students
        System.out.println(students.get(3));

//        c) In ra phần tử đầu và phần tử cuối của students
        System.out.println(students.get(0));
        int lastIndex = students.size() - 1;
        System.out.println(students.get(lastIndex));

//        d) Thêm 1 phần tử vào vị trí đầu của students
        students.add(0, new Student("Minh"));

//        e) Thêm 1 phần tử vào vị trí cuối của students
        students.add(new Student("Phong"));

//        f) Đảo ngược vị trí của students
        System.out.println(students);
        for (int i = 0; i <= students.size() / 2; i++) {
            Student s1 = students.get(i);
            Student s2 = students.get(students.size() - 1 - i);
            students.set(i, s2);
            students.set(students.size() - 1 - i, s1);
        }
        System.out.println(students);

//        j) Xóa name của student có id = 2;
        for (Student student : students) {
            if (student.getId() == 2) {
                student.setName(null);
            }
        }

//        k) Delete student có id = 5;
        students.removeIf(student -> student.getId() == 5);
    }

    public static Student findStudentById(List<Student> students, int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public static void showStudentSameName(List<Student> students) {
        List<String> l1 = new LinkedList<>();
        List<String> l2 = new LinkedList<>();
        for (Student student : students) {
            String name = student.getName();
            if (l1.contains(name)) {
                if (!l2.contains(name)) {
                    l2.add(name);
                }
            } else {
                l1.add(name);
            }
        }
        System.out.println(l2);
    }
}
