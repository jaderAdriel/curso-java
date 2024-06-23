package interfaces.exer2.services;

public interface OnlinePaymentService {
    public double paymentFee(Double amount);

    default public double interest(Double amount, Integer months) {
        double interest = (1.00 * months) / 100;
        return amount * interest;
    }
}
