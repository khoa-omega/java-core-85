package entity;

import java.time.LocalDate;

public class Person implements Comparable<Person> {
    private int id;
    private String name;
    private LocalDate birthdate;
    private double score;

    public Person(int id, String name, LocalDate birthdate, double score) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public double getScore() {
        return score;
    }

    @Override
    public int compareTo(Person that) {
        return this.name.compareTo(that.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthdate=" + birthdate +
                ", score=" + score +
                '}';
    }
}
