package interfaces.exer1;

import interfaces.exer1.entities.CarRental;
import interfaces.exer1.entities.Vehicle;
import interfaces.exer1.services.BrazilTaxService;
import interfaces.exer1.services.RentalService;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rental data");
        System.out.print("Car Model: ");
        String carModel = sc.nextLine();

        LocalDateTime pickupDate, returnDate;
        while (true) {
            try {
                System.out.print("Pickup (dd/MM/yyyy hh:ss): ");
                pickupDate = LocalDateTime.from( fmt.parse(sc.nextLine()) );

                System.out.print("return (dd/MM/yyyy hh:ss): ");
                returnDate = LocalDateTime.from( fmt.parse(sc.nextLine()) );

                break;
            } catch (RuntimeException error ) {
                System.out.println("One or two of the dates is not recognized. Please, follow the format (dd/MM/yyyy hh:ss), and try again.\n");
            }
        }

        CarRental rental = new CarRental(pickupDate, returnDate, new Vehicle(carModel));


        System.out.print("Price per hour: ");
        double pricePerHour = sc.nextDouble();

        System.out.print("Price per day: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        rentalService.processInvoice(rental);

        System.out.println("FATURA: ");
        System.out.println("Pagamento básico: " + rental.getInvoice().getBasicPayment());
        System.out.println("Imposto: " + rental.getInvoice().getTax());
        System.out.println("Pagamento total: " + rental.getInvoice().getTotalPayment());

    }
}
