package entity;

public final class SecondaryStudent extends Student {
    public static int count;

    public SecondaryStudent(String name) {
        super(name);
        count++;
    }
}
