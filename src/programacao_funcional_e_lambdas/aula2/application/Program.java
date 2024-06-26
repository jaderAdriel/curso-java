package programacao_funcional_e_lambdas.aula2.application;


import programacao_funcional_e_lambdas.aula2.entities.Product;
import programacao_funcional_e_lambdas.aula2.util.ProductPredicate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("TV", 90.0));
        products.add(new Product("Notebook", 1200.0));
        products.add(new Product("Tablet", 450.0));


        products.removeIf(new ProductPredicate());

        for (Product product : products) {
            System.out.println(product + " ");
        }
    }
}
