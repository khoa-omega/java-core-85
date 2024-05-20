package frontend;

import entity.Student;

public class Program02 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "A", 1);
        Student s2 = new Student(2, "B", 2);
        Student s3 = new Student(3, "C", 1);
        Student s4 = new Student(4, "D", 3);
        Student s5 = new Student(5, "E", 1);
        Student s6 = new Student(6, "F", 2);
        Student s7 = new Student(7, "G", 1);
        Student s8 = new Student(8, "H", 3);
        Student s9 = new Student(9, "I", 1);
        Student s10 = new Student(10, "J", 2);
        Student[] students = {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10};

        // Câu a: Điểm danh cả lớp
        for (Student student : students) {
            student.diemDanh();
        }

        // Câu b:
        for (Student student : students) {
            if (student.getGroup() == 1) {
                student.hocBai();
            }
        }

        for (Student student : students) {
            if (student.getGroup() == 2) {
                student.diDonVeSinh();
            }
        }
    }
}
