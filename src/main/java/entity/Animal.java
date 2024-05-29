package entity;

public class Animal<T> {
    private T id;
    private String name;

    public Animal(T id, String name) {
        this.id = id;
        this.name = name;
    }
}
