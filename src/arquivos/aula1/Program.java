package arquivos.aula1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String basePath = "/home/jader/IdeaProjects/course/src/arquivos/aula1/";
        File file = new File(basePath+"in.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error ->" + e.getMessage());
        } finally {
            if (sc != null)
                sc.close();
        }
    }
}
