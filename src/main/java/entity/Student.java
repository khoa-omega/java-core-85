package entity;

public class Student {
    private int id;
    private String name;

    public static String college;
    public static int moneyGroup;
    public static int count;

    public Student(String name) {
        count++;
        this.id = count;
        this.name = name;
    }

    public static String getCollege() {
        return college;
    }

    public static void setCollege(String college) {
        Student.college = college;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
