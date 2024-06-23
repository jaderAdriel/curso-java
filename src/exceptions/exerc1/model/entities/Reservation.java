package exceptions.exerc1.model.entities;

import exceptions.exerc1.model.exceptions.DomainException;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {
    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut)  throws DomainException {
        this.roomNumber = roomNumber;
        this.updateDates(checkIn, checkOut);
    }

    public long duration(){
        return Duration.between(checkIn.atStartOfDay(), checkOut.atStartOfDay()).toDays();
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void updateDates(LocalDate checkIn, LocalDate checkOut) throws DomainException {
        LocalDate now = LocalDate.now();

        if (checkOut.isBefore(now)) {
            throw new DomainException("Reservation dates must be future date");
        }

        if (checkIn.isBefore(now)) {
            throw new DomainException("Check-out date must be after check-in date");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;

    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return "Room "
                + roomNumber
                + ", check-in: "
                + checkIn.format(fmt)
                + ", check-out: "
                + checkOut.format(fmt)
                + ", "
                + duration()
                + " nights.";
    }
}
