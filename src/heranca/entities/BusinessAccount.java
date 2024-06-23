package heranca.entities;

public class BusinessAccount extends Account{
    private double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, double loanLimit) {
        super(number, holder);
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount > this.loanLimit) return;

        double newBalance = this.getBalance() + amount;

        this.setBalance(newBalance);
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }
}
