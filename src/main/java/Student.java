public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showInfo() {
        System.out.println("student id: " + id);
        System.out.println("student name: " + name);
    }

    public class Gender {
        private String value;

        public Gender(String value) {
            this.value = value;
        }

        public void showInfo() {
            System.out.println("Gender: " + value);
        }

        public void showPrivateOuterClass() {
            System.out.println("Student id: " + id);
            System.out.println("Student name: " + name);
        }
    }
}
