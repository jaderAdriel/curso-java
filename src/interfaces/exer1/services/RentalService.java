package interfaces.exer1.services;

import interfaces.exer1.entities.CarRental;
import interfaces.exer1.entities.Invoice;

import java.time.temporal.ChronoUnit;

public class RentalService {
    private double pricePerHour;
    private double pricePerDay;
    private final TaxService taxService;

    public RentalService(double pricePerHour, double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public void processInvoice(CarRental carRental) {
        double minutes = ChronoUnit.MINUTES.between(carRental.getPickupDate(), carRental.getReturnDate());
        // add +1 to hours if has any minutes
        double hours = (minutes % 60 == 0) ? minutes / 60 : (minutes - minutes % 60 ) / 60 + 1;
        double days = (hours - (hours % 24)) / 24;
        hours = hours - days * 24;

        if ((days > 0 && hours > 0) || hours >= 12) {
            days++;
            hours = 0;
        }

        double subtotal = days * this.pricePerDay + hours * this.pricePerHour;

        carRental.setInvoice(new Invoice(subtotal, this.taxService.tax(subtotal)));
    }
}
