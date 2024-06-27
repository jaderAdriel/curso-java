package programacao_funcional_e_lambdas.exercicio.application;

import programacao_funcional_e_lambdas.exercicio.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {

        String path = "/home/jader/IdeaProjects/course/src/programacao_funcional_e_lambdas/exercicio/products.csv";

        List<Product> products = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                products.add(
                        new Product(fields[0], Double.parseDouble(fields[1]))
                );
                line = br.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        double medianPrice = products.stream().reduce(0., (subtotal, product) -> subtotal + product.getPrice(), Double::sum) / products.size();

        System.out.print("O Preço médio foi: ");
        System.out.printf("%.2f%n\n", medianPrice);

        products.stream()
                .filter(product -> product.getPrice() < medianPrice)
                .sorted((p1, p2) -> p2.getName().toUpperCase().compareTo(p1.getName().toUpperCase()))
                .map(product -> product.getName() + " -> " + product.getPrice())
                .forEach(System.out::println);

    }
}
