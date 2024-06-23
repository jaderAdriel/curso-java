package exercicios.exerc1;

import exercicios.exerc1.entities.Department;
import exercicios.exerc1.entities.HourContract;
import exercicios.exerc1.entities.Worker;
import exercicios.exerc1.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter department's name: ");
        Department department = new Department(sc.nextLine());
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String w_name = sc.nextLine();
        System.out.print("Level: ");
        WorkerLevel w_level = WorkerLevel.valueOf(sc.next());
        System.out.print("Base salary: ");
        double w_baseSalary = sc.nextDouble();
        Worker worker = new Worker(w_name, w_level, w_baseSalary, department);

        System.out.println("How many contracts to this worker?");
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("Enter contract #" + (i+1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            LocalDate c_date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.print("Value per hour: ");
            double c_valuePerHour = sc.nextDouble();
            System.out.print("Duration: ");
            int c_hours = sc.nextInt();
            worker.addContract( new HourContract(c_date, c_valuePerHour, c_hours));
        }

        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        YearMonth yearMonth_income = YearMonth.parse(sc.next(), DateTimeFormatter.ofPattern("MM/yyyy"));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for "
                + yearMonth_income.format(DateTimeFormatter.ofPattern("MM/yyyy")) + " : "
                + worker.income(yearMonth_income.getYear(), yearMonth_income.getMonthValue()));

        sc.close();
    }
}
