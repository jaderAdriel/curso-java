package programacao_funcional_e_lambdas.aula1.application;

import programacao_funcional_e_lambdas.aula1.entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("TV", 900.0));
        products.add(new Product("Notebook", 1200.0));
        products.add(new Product("Tablet", 450.0));

        // Comparator objeto de classe separada
        MyComparator comp = new MyComparator();
        products.sort(comp);

        // Comparator objeto de classe anonima
        Comparator<Product> comp1 = new Comparator<Product>() {
            @Override
            public int compare(Product product, Product t1) {
                return product.getName().toUpperCase().compareTo(t1.getName().toUpperCase());
            }
        };
        products.sort(comp1);

        // Comparator objeto de expressão lambda com chaves
        Comparator<Product> comp2 =  (product, t1) -> {
            return product.getName().toUpperCase().compareTo(t1.getName().toUpperCase());
        };
        products.sort(comp2);

        // Comparator objeto de expressão lambda
        Comparator<Product> comp3 = ((product, t1) -> product.getName().toUpperCase().compareTo(t1.getName().toUpperCase()) );
        products.sort(comp3);


        // Comparator expressão lambda direto no argumento
        products.sort((product, t1) -> product.getName().toUpperCase().compareTo(t1.getName().toUpperCase()));

        for (Product product : products) {
            System.out.println("product = " + product);
        }

    }
}
