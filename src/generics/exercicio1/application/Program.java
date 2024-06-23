package generics.exercicio1.application;

import generics.exercicio1.entities.Product;
import generics.exercicio1.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        String productsFilePath = "/home/jader/IdeaProjects/course/src/generics/exercicio1/products.csv";
        List<Product> products = new ArrayList<>();

        try (BufferedReader bf = new BufferedReader(new FileReader(productsFilePath))) {

            // read first line that has the column names
            bf.readLine();

            String line = bf.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                String productName = fields[0];
                Double productPrice = Double.parseDouble(fields[1]);

                products.add(
                        new Product(productName, productPrice)
                );

                line = bf.readLine();
            }

            Product productMaxPrice = CalculationService.max(products);
            System.out.println("Most expensive: ");
            System.out.println(productMaxPrice);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
