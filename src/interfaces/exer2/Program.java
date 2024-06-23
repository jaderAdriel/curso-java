package interfaces.exer2;

import interfaces.exer2.entities.Contract;
import interfaces.exer2.entities.Installment;
import interfaces.exer2.services.ContractService;
import interfaces.exer2.services.PaypalService;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy").withZone(ZoneId.systemDefault());

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do contrato:");
        System.out.print("Numero: ");
        int number = sc.nextInt();

        System.out.print("Data: ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);

        System.out.print("Valor do contrato: ");
        double value = sc.nextDouble();

        System.out.print("Entre com o número de parcelas: ");
        int installments = sc.nextInt();

        Contract contract = new Contract(number, date, value);
        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, installments);

        for (Installment installment : contract.getIntailments()) {
            System.out.println(installment.getDueDate().format(fmt) + " - " + installment.getAmount());
        }

    }
}
