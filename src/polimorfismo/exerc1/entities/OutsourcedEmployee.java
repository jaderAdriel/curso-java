package polimorfismo.exerc1.entities;

public class OutsourcedEmployee  extends  Employee{

    private double additionalCharge;
    public OutsourcedEmployee(String name, Integer workedHours, double valuePerHour, double additionalCharge) {
        super(name, workedHours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        double bonus = this.additionalCharge * 1.1;
        return super.payment() + bonus;
    }
}
