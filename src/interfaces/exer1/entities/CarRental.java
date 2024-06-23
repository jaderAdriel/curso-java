package interfaces.exer1.entities;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CarRental {
    private LocalDateTime pickupDate;
    private LocalDateTime returnDate;
    private Vehicle vehicle;
    private Invoice invoice;

    public CarRental(LocalDateTime pickupDate, LocalDateTime returnDate, Vehicle vehicle) {
        this.pickupDate = pickupDate;
        this.returnDate = returnDate;
        this.vehicle = vehicle;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    public LocalDateTime getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(LocalDateTime pickupDate) {
        this.pickupDate = pickupDate;
    }
}
