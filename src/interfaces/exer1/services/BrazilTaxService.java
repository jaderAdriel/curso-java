package interfaces.exer1.services;

public class BrazilTaxService implements TaxService{
    public BrazilTaxService() {
    }

    public double tax(double amount) {
        if (amount <= 100) return amount * 0.20;
        return amount * 0.15;
    }
}
