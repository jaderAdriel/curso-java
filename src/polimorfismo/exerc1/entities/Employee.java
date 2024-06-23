package polimorfismo.exerc1.entities;

public class Employee {
    private String name;
    private Integer workedHours;
    private double valuePerHour;

    public Employee(String name, Integer workedHours, double valuePerHour) {
        this.name = name;
        this.workedHours = workedHours;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(Integer workedHours) {
        this.workedHours = workedHours;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public double payment() {
        return this.workedHours * this.valuePerHour;
    }

    @Override
    public String toString() {
        return this.name + " = " +
                "name='" + name + '\'' +
                ", workedHours=" + workedHours +
                ", valuePerHour=" + valuePerHour +
                '}';
    }
}
