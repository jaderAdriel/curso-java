package dataStructures.list.exercicio1.application;
import dataStructures.list.exercicio1.entities.Employee;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many employees will be registered?");

        int n = sc.nextInt();
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println();

            System.out.println("Employee #" + (i + 1) + ":");

            System.out.print("Id: ");
            int employeeId = sc.nextInt();


            if ( position(employees, employeeId) != null) {
                System.out.println("Another employee already have this id, select another id");
                i--;
                continue;
            }

            sc.nextLine();
            System.out.print("Name: ");
            String employeeName = sc.nextLine();

            System.out.print("Salary: ");
            float employeeSalary = sc.nextFloat();

            employees.add(
                    new Employee(employeeId, employeeName, employeeSalary)
            );
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int idEmployeeToIncreaseSalary = sc.nextInt();

        Integer pos = position(employees, idEmployeeToIncreaseSalary);
        if (pos == null) {
            System.out.println("This id does not exits!");
            return;
        }

        System.out.println("Enter the percentage: ");
        float percentageToIncreaseEmployeeSalary = sc.nextFloat();

        employees.get(pos).increaseSalary(percentageToIncreaseEmployeeSalary);

        System.out.println("List of employees: \n");
        for (Employee employee: employees) {
            System.out.println(employee);
        }

    }

    public static Integer position(List<Employee> list, int id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) return i;
        }
        return null;
    }
}
