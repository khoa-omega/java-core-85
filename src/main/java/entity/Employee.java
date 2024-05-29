package entity;

public class Employee<E> {
    private int id;
    private String name;
    private E[] salaries;

    public Employee(int id, String name, E[] salaries) {
        this.id = id;
        this.name = name;
        this.salaries = salaries;
    }

    public void showInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salaries:");
        for (E salary : salaries) {
            System.out.println("salary = " + salary);
        }
    }

    public void showLast() {
        int lastIndex = salaries.length - 1;
        E lastSalary = salaries[lastIndex];
        System.out.println("lastSalary = " + lastSalary);
    }
}
