package date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Exercicio1 {
    public static void main(String[] args) {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now(); // -> Global, horário de Londres

        System.out.println("d01.getMonth().getValue() = " + d01.getMonth().getValue());
        
        LocalDate d04 = LocalDate.parse("2005-02-19");
        LocalDateTime d05 = LocalDateTime.parse("2005-02-19T12:00");
        Instant d06 = Instant.now();

        LocalDateTime d07 = LocalDateTime.of(2020, 7, 23, 5, 40);



        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + fmt.format(d06) + " no fuso " + ZoneId.systemDefault());
        System.out.println("d07 = " + d07);

        
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        System.out.println("r1 = " + r1);

        System.out.println("d04.plusMonths(12) = " + d04.plusMonths(12)); // contas com localDate
        System.out.println("d04.plusMonths(12) = " + d06.minus(12, ChronoUnit.HOURS)); // contas com instant

        Instant d08 = Instant.now().minus(7, ChronoUnit.DAYS);

        Duration t1 = Duration.between(d08, Instant.now());
        System.out.println("t1 = " + t1.toDays());
    }
}
