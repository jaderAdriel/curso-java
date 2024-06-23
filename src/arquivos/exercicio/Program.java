package arquivos.exercicio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path)) ) {

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
