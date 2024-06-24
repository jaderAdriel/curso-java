package programacao_funcional_e_lambdas.aula1.application;

import programacao_funcional_e_lambdas.aula1.entities.Product;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {

    @Override
    public int compare(Product product, Product t1) {
        return product.getName().toUpperCase().compareTo(t1.getName().toUpperCase());
    }
}
