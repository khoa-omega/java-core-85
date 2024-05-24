package entity;

public class Student {
    private int id;
    private String name;

    public static String college;
    public static int moneyGroup;
    public static int count;

    public Student(String name) {
        if (count >= 7) {
            throw new IllegalStateException("Tối đa 7 học sinh");
        }
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
