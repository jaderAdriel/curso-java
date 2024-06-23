package heranca.entities;

public class Account {
    private Integer number;
    private String holder;
    protected double balance = 0.0;

    public Account() {
    }

    public Account(Integer number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }
    public void deposit( double amount) {
        this.balance += amount;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double amount) {
        this.balance = amount;
    }
}
