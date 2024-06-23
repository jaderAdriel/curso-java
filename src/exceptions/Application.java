package exceptions;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] vect = sc.nextLine().split(" ");

        show(vect);


        sc.close();
    }

    static void show(String[] vect) {
        Scanner sc = new Scanner(System.in);

        try {
            int position = sc.nextInt();
            System.out.println("vect[position] = " + vect[position]);
            sc.close();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição inválida");
            e.printStackTrace();
            show(vect);
        } catch (InputMismatchException e) {
            System.out.println("O índice têm de ser um numero");
            show(vect);
        }
        return;
    }
}
