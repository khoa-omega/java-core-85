package entity;

public final class PrimaryStudent extends Student {
    public static int count;

    public PrimaryStudent(String name) {
        super(name);
        count++;
    }
}
