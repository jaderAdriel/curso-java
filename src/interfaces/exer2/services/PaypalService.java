package interfaces.exer2.services;

public class PaypalService implements OnlinePaymentService{
    public double paymentFee(Double amount) {
        double paymentFee = 0.02;
        return amount * paymentFee;
    }
}
