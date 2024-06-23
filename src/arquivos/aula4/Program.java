package arquivos.aula4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        String[] lines = new String[] {"Olá", "Meu nome é Jader", "E tenho 21 anos", "E gosto de programar, mas estou procastinando muito"};

        String path = "/home/jader/IdeaProjects/course/src/arquivos/aula4/out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
