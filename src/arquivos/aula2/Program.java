package arquivos.aula2;

import java.io.BufferedReader;
import java.io.FileReader;

public class Program {
    public static void main(String[] args) {
        String basePath = "/home/jader/IdeaProjects/course/src/arquivos/aula2/";
        String path = basePath + "in.txt";

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) bufferedReader.close();
                if (fileReader != null) fileReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
