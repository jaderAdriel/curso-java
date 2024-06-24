package generics.set_exercicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        String path = "/home/jader/IdeaProjects/course/src/generics/set_exercicio/logs.txt";

        Set<String> users = new HashSet<>();

        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {

            String line = bf.readLine();

            while (line != null) {
                String[] fields = line.split(" ");
                users.add(fields[0]);
                line = bf.readLine();
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Quantidade de usuários: " + users.size());

    }
}
