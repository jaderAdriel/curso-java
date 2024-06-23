package arquivos.aula5;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String basePath = "/home/jader/IdeaProjects/course/src/arquivos/aula5/";

        System.out.println("Enter a folder path:");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("Folders:");
        if (folders.length > 0) {
            for (File folder : folders) {
                System.out.println(folder);
            }
        } else {
            System.out.println("no folder was found");
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("Files:");
        if (files.length > 0) {
            for (File file : files) {
                System.out.println(file);
            }
        } else {
            System.out.println("no file was found");
        }

        System.out.println("\nCreating test directory... ");
        boolean success = new File(strPath + "/teste").mkdir();
        System.out.println(success);

        sc.close();
    }
}
