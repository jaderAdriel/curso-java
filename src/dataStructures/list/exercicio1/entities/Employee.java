package dataStructures.list.exercicio1.entities;

public class Employee {
    private int id;
    private String name;
    private float salary;

    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void increaseSalary(float percentage ) {
        this.salary += salary * (percentage / 100);
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + String.format("%2f", salary);
    }
}
