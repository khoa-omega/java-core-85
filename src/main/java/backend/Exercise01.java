package backend;

import entity.HinhChuNhat;
import entity.HinhHoc;
import entity.HinhTron;
import entity.PrimaryStudent;
import entity.SecondaryStudent;
import entity.Student;

public class Exercise01 {
    public static void question01() {
        Student s1 = new Student("Nguyễn Văn A");
        Student s2 = new Student("Nguyễn Văn B");
        Student s3 = new Student("Nguyễn Văn C");

        Student.college = "Đại học bách khoa";
        System.out.println("s1.college = " + s1.college);
        System.out.println("s2.college = " + s2.college);
        System.out.println("s3.college = " + s3.college);

        Student.college = "Đại học công nghệ";
        System.out.println("s1.college = " + s1.college);
        System.out.println("s2.college = " + s2.college);
        System.out.println("s3.college = " + s3.college);
    }

    public static void question02() {
        Student s1 = new Student("Nguyễn Văn A");
        Student s2 = new Student("Nguyễn Văn B");
        Student s3 = new Student("Nguyễn Văn C");

        s1.moneyGroup += 100;
        s2.moneyGroup += 100;
        s3.moneyGroup += 100;
        System.out.println("Quỹ lớp: " + Student.moneyGroup);

        s1.moneyGroup -= 50;
        System.out.println("Quỹ lớp: " + Student.moneyGroup);

        s2.moneyGroup -= 20;
        System.out.println("Quỹ lớp: " + Student.moneyGroup);

        s3.moneyGroup -= 150;
        System.out.println("Quỹ lớp: " + Student.moneyGroup);

        s1.moneyGroup += 50;
        s2.moneyGroup += 50;
        s3.moneyGroup += 50;
        System.out.println("Quỹ lớp: " + Student.moneyGroup);
    }

    public static void question05() {
        Student s1 = new Student("Nguyễn Văn A");
        Student s2 = new Student("Nguyễn Văn B");
        Student s3 = new Student("Nguyễn Văn C");

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("Số lượng học sinh: " + Student.count);
    }

    public static void question06() {
        Student s1 = new PrimaryStudent("A");
        Student s2 = new PrimaryStudent("B");
        Student s3 = new SecondaryStudent("C");
        Student s4 = new SecondaryStudent("D");
        Student s5 = new SecondaryStudent("E");
        Student s6 = new SecondaryStudent("F");
        System.out.println("Số lượng student: " + Student.count);
        System.out.println("Số lượng primary student: " + PrimaryStudent.count);
        System.out.println("Số lượng secondary student: " + SecondaryStudent.count);
    }

    public static void question07() {
        Student s1 = new PrimaryStudent("A");
        Student s2 = new PrimaryStudent("B");
        Student s3 = new SecondaryStudent("C");
        Student s4 = new SecondaryStudent("D");
        Student s5 = new SecondaryStudent("E");
        Student s6 = new SecondaryStudent("F");
        Student s7 = new SecondaryStudent("G");
        Student s8 = new SecondaryStudent("H");
        System.out.println("Số lượng student: " + Student.count);
        System.out.println("Số lượng primary student: " + PrimaryStudent.count);
        System.out.println("Số lượng secondary student: " + SecondaryStudent.count);
    }

    public static void question08() {
        HinhHoc h1 = new HinhTron(10.0);
        HinhHoc h2 = new HinhTron(100.0);
        HinhHoc h3 = new HinhTron(1000.0);
        HinhChuNhat h4 = new HinhChuNhat(1.0, 2.0);
        HinhChuNhat h5 = new HinhChuNhat(10.0, 20.0);
        HinhChuNhat h6 = new HinhChuNhat(100.0, 200.0);
        System.out.println("Số hình học là: " + HinhHoc.count);
    }
}
