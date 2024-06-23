package dataStructures.matriz;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int rows, cols;

        rows = sc.nextInt();
        cols = sc.nextInt();

        int[][] matriz = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int x = sc.nextInt();
                matriz[i][j] = x;
            }
        }
        int chosenNumber = sc.nextInt();

        showDirections(matriz, rows, cols, chosenNumber);

    }

    public static void showDirections(int[][] matriz, int rows, int cols, int chosenNumber) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matriz[i][j] != chosenNumber) continue;
                System.out.println("\nPosition: (" + i + "," + j + ")");
                if (i - 1 >= 0)   System.out.println("upper = " + matriz[i-1][j]);
                if (i + 1 < rows)  System.out.println("down = " + matriz[i+1][j]);
                if (j - 1 >= 0)    System.out.println("left = " + matriz[i][j-1]);
                if (j + 1 < cols) System.out.println("right = " + matriz[i][j+1]);
            }
        }
    }
}
