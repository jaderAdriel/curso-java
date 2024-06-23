package polimorfismo.exerc1;

import polimorfismo.exerc1.entities.Employee;
import polimorfismo.exerc1.entities.OutsourcedEmployee;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of employees: ");

        int n = sc.nextInt();
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee #" + (i + 1) + ":");

            System.out.print("Outsourced: ");
            String outsourced = sc.next();

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Worked hours: ");
            int workedHours = sc.nextInt();

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();


            if (outsourced.equals("y")) {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();

                employees.add( new OutsourcedEmployee(name, workedHours, valuePerHour, additionalCharge));
            } else {
                employees.add( new Employee(name, workedHours, valuePerHour));
            }
        }

        System.out.println("\nPAYMENTS");
        for (Employee employee : employees) {
            System.out.println(employee.getName().toUpperCase() + " - R$    " + employee.payment());
        }

    }
}
